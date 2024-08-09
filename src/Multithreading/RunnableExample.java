package Multithreading;

class ThreadOne implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 1 "+i);
        }
    }
}

class ThreadTwo implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 2 "+i);
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadOne());
        Thread t2 = new Thread(new ThreadTwo());
        t1.start();
        t2.start();
    }
}
