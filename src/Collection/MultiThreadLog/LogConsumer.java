package Collection.MultiThreadLog;

public class LogConsumer implements Runnable {

    private LogService logService;

    public LogConsumer(LogService logService) {
        this.logService = logService;
    }

    @Override
    public void run(){
        try {
            while (true) {
                String log = logService.getLog();
                System.out.println("read by " + Thread.currentThread().getName() + " -> " + log);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
