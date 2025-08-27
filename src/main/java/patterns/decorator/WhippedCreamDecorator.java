package patterns.decorator;

/**
 * Concrete Decorator - Adds whipped cream to coffee
 */
public class WhippedCreamDecorator extends CoffeeDecorator {

  public WhippedCreamDecorator(Coffee coffee) {
    super(coffee);
  }

  @Override
  public String getDescription() {
    return coffee.getDescription() + ", Whipped Cream";
  }

  @Override
  public double getCost() {
    return coffee.getCost() + 0.75;
  }
}