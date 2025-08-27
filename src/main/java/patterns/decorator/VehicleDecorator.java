package patterns.decorator;

/**
 * Base Vehicle Decorator class
 */
public abstract class VehicleDecorator implements Vehicle {

  protected Vehicle vehicle;

  public VehicleDecorator(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  @Override
  public String getDescription() {
    return vehicle.getDescription();
  }

  @Override
  public double getPrice() {
    return vehicle.getPrice();
  }

  @Override
  public int getHorsepower() {
    return vehicle.getHorsepower();
  }
}