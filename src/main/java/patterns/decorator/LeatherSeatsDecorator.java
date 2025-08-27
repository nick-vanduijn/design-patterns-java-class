package patterns.decorator;

/**
 * Concrete Decorator - Adds leather seats to vehicle
 */
public class LeatherSeatsDecorator extends VehicleDecorator {

  public LeatherSeatsDecorator(Vehicle vehicle) {
    super(vehicle);
  }

  @Override
  public String getDescription() {
    return vehicle.getDescription() + " with Leather Seats";
  }

  @Override
  public double getPrice() {
    return vehicle.getPrice() + 2500.0;
  }

  @Override
  public int getHorsepower() {
    return vehicle.getHorsepower();
  }
}