package Multithreading;

class DeamonHelper implements Runnable{
    @Override
    public void run() {
        int count = 0;
        while(count < 500){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count++;
            System.out.println("Deamon Thread Running......");
        }
    }
}

class UserThreadHelper implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("User Thread ");
    }
}

public class DeamonUserThreadDemo {
    public static void main(String[] args) {
        Thread bgThread = new Thread(new DeamonHelper());
        Thread usrThread= new Thread(new UserThreadHelper());
        bgThread.setDaemon(true);
        bgThread.start();
        usrThread.start();


    }
}
