package patterns.decorator;

/**
 * Concrete Component - Basic Car implementation
 */
public class BasicCar implements Vehicle {

  @Override
  public String getDescription() {
    return "Basic Car";
  }

  @Override
  public double getPrice() {
    return 20000.0;
  }

  @Override
  public int getHorsepower() {
    return 150;
  }
}