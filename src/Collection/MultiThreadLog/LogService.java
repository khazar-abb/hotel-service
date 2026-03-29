package Collection.MultiThreadLog;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LogService {
    private BlockingQueue<String> logs = new LinkedBlockingQueue<>();

    public void addLog(String log) throws InterruptedException {
        logs.put(log);
    }

    public String getLog() throws InterruptedException {
        return logs.take();
    }
}
