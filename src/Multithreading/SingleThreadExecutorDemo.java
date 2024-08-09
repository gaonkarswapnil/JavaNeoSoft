package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorDemo {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newSingleThreadExecutor()) {
            for (int i = 0; i < 10; i++) {
                service.execute(new Task(i));
            }
        }
    }
}

class Task implements Runnable{
    private final int task;

    public Task(int task) {
        this.task = task;
    }

    @Override
    public void run() {
        System.out.println("Task " + task+" being executed by "+Thread.currentThread().getName());

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}