package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CashedThreadPool {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newCachedThreadPool()) {
            for (int i = 0; i < 5; i++) {
                service.execute(new TaskOne(i));
            }
        }
    }
}

class TaskOne implements Runnable {
    private final int workId;

    public TaskOne(int workId) {
        this.workId = workId;
    }

    @Override
    public void run() {
        System.out.println("Thread " + workId + " executed by " + Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}