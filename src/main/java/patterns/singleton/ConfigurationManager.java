package patterns.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Bill Pugh Singleton Pattern Example (Initialization-on-demand holder idiom)
 * This is the most efficient way to implement singleton - thread safe and lazy
 */
public class ConfigurationManager {

  private Map<String, String> properties;

  private ConfigurationManager() {
    this.properties = new HashMap<>();

    loadDefaultProperties();
    System.out.println("ConfigurationManager instance created");
  }

  private static class SingletonHelper {
    private static final ConfigurationManager INSTANCE = new ConfigurationManager();
  }

  public static ConfigurationManager getInstance() {
    return SingletonHelper.INSTANCE;
  }

  private void loadDefaultProperties() {
    properties.put("app.name", "MyApplication");
    properties.put("app.version", "1.0.0");
    properties.put("database.host", "localhost");
    properties.put("database.port", "3306");
    properties.put("cache.enabled", "true");
    properties.put("logging.level", "INFO");
  }

  public String getProperty(String key) {
    return properties.get(key);
  }

  public String getProperty(String key, String defaultValue) {
    return properties.getOrDefault(key, defaultValue);
  }

  public void setProperty(String key, String value) {
    properties.put(key, value);
    System.out.println("Property set: " + key + " = " + value);
  }

  public boolean hasProperty(String key) {
    return properties.containsKey(key);
  }

  public void removeProperty(String key) {
    String removedValue = properties.remove(key);
    if (removedValue != null) {
      System.out.println("Property removed: " + key);
    }
  }

  public Map<String, String> getAllProperties() {
    return new HashMap<>(properties);
  }

  public void displayAllProperties() {
    System.out.println("=== Configuration Properties ===");
    properties.forEach((key, value) -> System.out.println(key + " = " + value));
  }
}