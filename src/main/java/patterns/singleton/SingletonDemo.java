package patterns.singleton;

/**
 * Demo class to demonstrate all three Singleton patterns
 */
public class SingletonDemo {

  public static void main(String[] args) {
    System.out.println("=== Singleton Pattern Demonstrations ===\n");

    System.out.println("1. Database Connection Singleton (Eager Initialization):");
    DatabaseConnection db1 = DatabaseConnection.getInstance();
    DatabaseConnection db2 = DatabaseConnection.getInstance();

    System.out.println("db1 == db2: " + (db1 == db2));

    db1.connect();
    db1.executeQuery("SELECT * FROM users");
    db2.executeQuery("SELECT * FROM products");
    db1.disconnect();

    System.out.println();

    System.out.println("2. Logger Singleton (Thread-Safe Lazy Initialization):");
    Logger logger1 = Logger.getInstance();
    Logger logger2 = Logger.getInstance();

    System.out.println("logger1 == logger2: " + (logger1 == logger2));

    logger1.info("Application started");
    logger2.warning("This is a warning message");
    logger1.error("An error occurred");
    logger2.debug("Debug information");

    System.out.println("Total logs: " + logger1.getLogCount());

    System.out.println();

    System.out.println("3. Configuration Manager Singleton (Bill Pugh Pattern):");
    ConfigurationManager config1 = ConfigurationManager.getInstance();
    ConfigurationManager config2 = ConfigurationManager.getInstance();

    System.out.println("config1 == config2: " + (config1 == config2));

    config1.displayAllProperties();

    config1.setProperty("custom.setting", "custom_value");
    System.out.println("Custom setting from config2: " + config2.getProperty("custom.setting"));

    System.out.println();

    System.out.println("4. Thread Safety Test (Logger):");
    Thread thread1 = new Thread(() -> {
      Logger logger = Logger.getInstance();
      for (int i = 0; i < 3; i++) {
        logger.info("Thread 1 - Message " + (i + 1));
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      }
    });

    Thread thread2 = new Thread(() -> {
      Logger logger = Logger.getInstance();
      for (int i = 0; i < 3; i++) {
        logger.warning("Thread 2 - Warning " + (i + 1));
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      }
    });

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }

    System.out.println("Final log count: " + Logger.getInstance().getLogCount());
  }
}