package patterns.singleton;

/**
 * Eager Initialization Singleton Pattern Example
 * This singleton is created at class loading time - thread safe but not lazy
 */
public class DatabaseConnection {

  private static final DatabaseConnection INSTANCE = new DatabaseConnection();

  private String connectionString;
  private boolean isConnected;

  private DatabaseConnection() {
    this.connectionString = "jdbc:mysql://localhost:3306/mydb";
    this.isConnected = false;
    System.out.println("Database connection instance created");
  }

  public static DatabaseConnection getInstance() {
    return INSTANCE;
  }

  public void connect() {
    if (!isConnected) {
      isConnected = true;
      System.out.println("Connected to database: " + connectionString);
    } else {
      System.out.println("Already connected to database");
    }
  }

  public void disconnect() {
    if (isConnected) {
      isConnected = false;
      System.out.println("Disconnected from database");
    }
  }

  public boolean isConnected() {
    return isConnected;
  }

  public void executeQuery(String query) {
    if (isConnected) {
      System.out.println("Executing query: " + query);
    } else {
      System.out.println("Cannot execute query - not connected to database");
    }
  }
}