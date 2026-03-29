package Collection.MultiThreadLog;

import java.util.Random;

public class LogProducer implements Runnable{
    private LogService logService;
    private Random random = new Random();

    private String[] messages = {
            "User logged in",
            "Payment completed",
            "Order created",
            "Error occurred"
    };

    public LogProducer(LogService logService) {
        this.logService = logService;
    }

    @Override
    public void run() {
        try {
            while (true){
                String message = messages[random.nextInt(messages.length)];
                logService.addLog(Thread.currentThread().getName() + ": " + message);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
