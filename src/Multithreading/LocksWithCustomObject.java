package Multithreading;

public class LocksWithCustomObject {
    private static int counter1 = 0;
    private static int counter2 = 0;

    private static Object lock1 = new Object();
    private static Object lock2 = new Object();


    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment1();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment2();
            }
        });
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(counter1+"-------"+counter2);
    }

    public static void increment1() {
        synchronized (lock1){
            counter1++;
        }
    }

    public static void increment2() {
        synchronized (lock2){
            counter2++;
        }
    }
}
