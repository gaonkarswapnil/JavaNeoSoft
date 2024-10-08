package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
    public static void main(String[] args) {
        try(ExecutorService service = Executors.newFixedThreadPool(2)){
            for (int i = 0; i < 7; i++) {
                service.execute(new Work(i));
            }
        }
    }
}

class Work implements Runnable {
    private int workID;

    public Work(int workID) {
        this.workID = workID;
    }

    @Override
    public void run() {
        System.out.println("TaskID "+ workID+" is being executed by "+Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}