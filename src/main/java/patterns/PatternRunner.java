package patterns;

import patterns.singleton.SingletonDemo;
import patterns.decorator.DecoratorDemo;

/**
 * Main class to run all pattern demonstrations
 */
public class PatternRunner {

  public static void main(String[] args) {
    System.out.println("=== Design Patterns Examples ===");
    System.out.println("This project demonstrates Singleton and Decorator patterns\n");

    try {
      SingletonDemo.main(args);

      System.out.println("\n" + "=".repeat(60) + "\n");

      DecoratorDemo.main(args);

    } catch (Exception e) {
      System.err.println("Error running demonstrations: " + e.getMessage());
      e.printStackTrace();
    }

    System.out.println("\n=== End of Demonstrations ===");
  }
}