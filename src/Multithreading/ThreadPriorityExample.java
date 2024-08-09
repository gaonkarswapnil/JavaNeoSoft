package Multithreading;

public class ThreadPriorityExample {
    public static void main(String[] args) {
        System.out.println("Hii from Main");

        Thread t1 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
            System.out.println("Hii from Thread one");
        });
        t1.setPriority(Thread.MIN_PRIORITY);

        Thread t2 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
            System.out.println("Hii from Thread two");
        });
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
