package Multithreading;

public class WaitAndNotifyDemo {
    private static int count = 0;
    private static final Object lock = new Object();
    private static boolean flag = true;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (lock) {
                    while (!flag){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println("method 1");
                    increment();
                    flag = false;
                    lock.notify();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (lock){
                    while (flag){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println("method 2");
                    increment();
                    flag = true;
                    lock.notify();
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(count);
    }

    public static void increment(){
        count++;
    }
}
