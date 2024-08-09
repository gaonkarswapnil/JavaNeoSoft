package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newScheduledThreadPool(1);
        ((ScheduledExecutorService) service).scheduleAtFixedRate(new TaskTwo(), 1000, 2000, TimeUnit.MILLISECONDS);
//            for (int i = 0; i < 10; i++) {
//                service.execute(new TaskTwo(i));
//            }
    }
}

class TaskTwo implements Runnable {
//    private final int workID;
//
//    public TaskTwo(int workID) {
//        this.workID = workID;
//    }

    @Override
    public void run() {
//        System.out.println("Task "+workID+" executed on thread "+Thread.currentThread().getName());
        System.out.println("Probing end point...");
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}
