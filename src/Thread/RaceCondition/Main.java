package Thread.RaceCondition;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        CounterTask task = new CounterTask(counter);

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Final count: " + counter.getCount());
    }
}