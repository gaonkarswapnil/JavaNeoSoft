package Multithreading;

public class JoinThreadExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread 1: " + i);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Thread 2: " + i);
                }
            }
        });
        try {
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.println("Main thread joined");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
