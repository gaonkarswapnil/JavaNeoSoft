package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CPUIntensiveTask {
    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();
        try (ExecutorService service = Executors.newFixedThreadPool(cores)) {
            System.out.println("Code running on " + cores + " cores");
            for (int i = 0; i < 10; i++) {
                service.execute(new CPUTask());
            }
        }

    }
}

class CPUTask implements Runnable {

    @Override
    public void run() {
        System.out.println("CPU intensive task being done on "+Thread.currentThread().getName());
    }
}
