package singleton;

public class LoggerService {

    private static volatile LoggerService instance;

    private LoggerService() {
        // private constructor to prevent instantiation
    }

    public static LoggerService getInstance() {
        if (instance == null) { // First check
            synchronized (LoggerService.class) {
                if (instance == null) { // Second check within synchronized block
                    instance = new LoggerService();
                }
            }
        }
        return instance;
    }

    public void logMessage(String message) {
        // Simulate logging logic
        System.out.println("Logging: " + message);
    }

}

