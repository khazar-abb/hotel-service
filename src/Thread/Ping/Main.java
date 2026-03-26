package Thread.Ping;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        PingPongTask myRunnable = new PingPongTask();

        Thread t1 = new Thread(myRunnable, "Ping");
        Thread t2 = new Thread(myRunnable, "Pong");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Main finished");
    }
}