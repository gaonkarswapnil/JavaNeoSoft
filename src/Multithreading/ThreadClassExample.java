package Multithreading;

class Thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
public class ThreadClassExample {
    public static void main(String[] args) {
        Thread t1 = new Thread1();
        Thread t2 = new Thread2();
        Thread t3 = new Thread(){
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        };
        Thread t4 = new Thread(
                () -> {
                    for (int i = 0; i < 25; i++) {
                        System.out.println(Thread.currentThread().getName() + " " + i);
                    }
                }
        );
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
