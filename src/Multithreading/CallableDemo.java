package Multithreading;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(2)) {
//            service.execute(new ReturnValueTask());
            Future<Integer> result = service.submit(new ReturnValueTask());
            try {
                System.out.println(result.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class ReturnValueTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return 12;
    }
}
