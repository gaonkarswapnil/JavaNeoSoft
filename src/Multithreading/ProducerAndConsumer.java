package Multithreading;

import java.util.ArrayList;
import java.util.List;

class ProducerAndConsumerClass {
    private  int sequence = 0;
    private final Integer top;
    private final Integer bottom;
    private final List<Integer> container;
    private static final Object lock = new Object();

    public ProducerAndConsumerClass(Integer top, Integer bottom) {
        this.top = top;
        this.bottom = bottom;
        this.container = new ArrayList<>();
    }

    public void producer() throws InterruptedException {
        synchronized (lock){
            while(true){
                if(container.size() == top){
                    System.out.println("Container is full");
                    lock.wait();
                }else {
                    System.out.println(sequence+" added to container");
                    container.add(sequence++);
                    lock.notify();
                }
                Thread.sleep(500);
            }
        }
    }

    public void consumer() throws InterruptedException {
        synchronized (lock){
            while(true){
                if(container.size() == bottom) {
                    System.out.println("Container is empty");
                    lock.wait();
                }else {
                    System.out.println(container.removeFirst()+" removed from container");
                    lock.notify();
                }
                Thread.sleep(500);
            }
        }
    }
}

public class ProducerAndConsumer {
    public static void main(String[] args) {
        ProducerAndConsumerClass obj = new ProducerAndConsumerClass(5,0);

        Thread consumer = new Thread(()->{
            try {
                obj.consumer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread producer = new Thread(()->{
            try {
                obj.producer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        consumer.start();
        producer.start();
    }
}