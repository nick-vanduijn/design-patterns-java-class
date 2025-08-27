package patterns.decorator;

/**
 * Concrete Decorator - Adds GPS navigation to vehicle
 */
public class GPSNavigationDecorator extends VehicleDecorator {

  public GPSNavigationDecorator(Vehicle vehicle) {
    super(vehicle);
  }

  @Override
  public String getDescription() {
    return vehicle.getDescription() + " with GPS Navigation";
  }

  @Override
  public double getPrice() {
    return vehicle.getPrice() + 1500.0;
  }

  @Override
  public int getHorsepower() {
    return vehicle.getHorsepower();
  }
}