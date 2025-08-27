package patterns.decorator;

/**
 * Concrete Component - Basic Coffee implementation
 */
public class SimpleCoffee implements Coffee {

  @Override
  public String getDescription() {
    return "Simple Coffee";
  }

  @Override
  public double getCost() {
    return 2.00;
  }
}