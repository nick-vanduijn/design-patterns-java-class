package patterns.singleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Thread-Safe Lazy Initialization Singleton Pattern Example
 * This singleton uses synchronized method for thread safety
 */
public class Logger {

  private static Logger instance;
  private List<String> logs;
  private DateTimeFormatter formatter;

  private Logger() {
    this.logs = new ArrayList<>();
    this.formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    System.out.println("Logger instance created");
  }

  public static synchronized Logger getInstance() {
    if (instance == null) {
      instance = new Logger();
    }
    return instance;
  }

  public void log(String level, String message) {
    String timestamp = LocalDateTime.now().format(formatter);
    String logEntry = String.format("[%s] %s: %s", timestamp, level, message);
    logs.add(logEntry);
    System.out.println(logEntry);
  }

  public void info(String message) {
    log("INFO", message);
  }

  public void warning(String message) {
    log("WARNING", message);
  }

  public void error(String message) {
    log("ERROR", message);
  }

  public void debug(String message) {
    log("DEBUG", message);
  }

  public List<String> getAllLogs() {
    return new ArrayList<>(logs);
  }

  public void clearLogs() {
    logs.clear();
    System.out.println("All logs cleared");
  }

  public int getLogCount() {
    return logs.size();
  }
}