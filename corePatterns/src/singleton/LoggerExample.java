package singleton;

public class LoggerExample {

    public static void main(String[] args) {
        // Create multiple threads to access the LoggerService
        Thread thread1 = new Thread(() -> {
            LoggerService logger = LoggerService.getInstance();
            logger.logMessage("Thread 1: Log message from LoggerService");
        });

        Thread thread2 = new Thread(() -> {
            LoggerService logger = LoggerService.getInstance();
            logger.logMessage("Thread 2: Log message from LoggerService");
        });

        // Start the threads
        thread1.start();
        thread2.start();
    }
}

