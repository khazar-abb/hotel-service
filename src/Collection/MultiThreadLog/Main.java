package Collection.MultiThreadLog;

public class Main {
    public static void main(String[] args) {

        LogService logService = new LogService();

        Thread producer1 = new Thread(new LogProducer(logService), "producer-01");
        Thread producer2 = new Thread(new LogProducer(logService), "producer-02");
        Thread producer3 = new Thread(new LogProducer(logService), "producer-03");

        Thread consumer = new Thread(new LogConsumer(logService), "consumer");

        producer1.start();
        producer2.start();
        producer3.start();
        consumer.start();
    }
}
