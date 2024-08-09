package Multithreading;

public class WaitAndNotifyExample {
    private static final Object LOCK = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                one();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                two();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
    }

    public static void one() throws InterruptedException {
        synchronized (LOCK) {
            System.out.println("Hii from Method One");
            LOCK.wait();
            System.out.println("Welcome back to Method One");
        }
    }

    public static void two() throws InterruptedException {
        synchronized (LOCK){
            System.out.println("Hii from Method Two");
            LOCK.notify();
            System.out.println("Hii again from Method Two after notify");
        }
    }
}
