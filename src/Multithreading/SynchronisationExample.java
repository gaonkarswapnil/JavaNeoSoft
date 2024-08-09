package Multithreading;

public class SynchronisationExample {
    private static int counter = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread(() ->{
            for (int i = 0; i < 10000; i++) {
                incrementCounter();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                incrementCounter();
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

        System.out.println(counter);
    }

    private synchronized static void incrementCounter() {
        counter++;
    }
}

