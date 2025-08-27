package patterns.decorator;

/**
 * Concrete Decorator - Adds turbo engine to vehicle
 */
public class TurboEngineDecorator extends VehicleDecorator {

  public TurboEngineDecorator(Vehicle vehicle) {
    super(vehicle);
  }

  @Override
  public String getDescription() {
    return vehicle.getDescription() + " with Turbo Engine";
  }

  @Override
  public double getPrice() {
    return vehicle.getPrice() + 5000.0;
  }

  @Override
  public int getHorsepower() {
    return vehicle.getHorsepower() + 100;
  }
}