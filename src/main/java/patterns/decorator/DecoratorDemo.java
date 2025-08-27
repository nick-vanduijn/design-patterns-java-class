package patterns.decorator;

/**
 * Demo class to demonstrate all three Decorator patterns
 */
public class DecoratorDemo {

  public static void main(String[] args) {
    System.out.println("=== Decorator Pattern Demonstrations ===\n");

    System.out.println("1. Coffee Decorator Pattern:");

    Coffee coffee = new SimpleCoffee();
    System.out.println(coffee.getDescription() + " - $" + coffee.getCost());

    coffee = new MilkDecorator(coffee);
    System.out.println(coffee.getDescription() + " - $" + coffee.getCost());

    coffee = new SugarDecorator(coffee);
    System.out.println(coffee.getDescription() + " - $" + coffee.getCost());

    coffee = new WhippedCreamDecorator(coffee);
    System.out.println(coffee.getDescription() + " - $" + coffee.getCost());

    Coffee fancyCoffee = new WhippedCreamDecorator(
        new SugarDecorator(
            new MilkDecorator(
                new SimpleCoffee())));
    System.out.println("Fancy: " + fancyCoffee.getDescription() + " - $" + fancyCoffee.getCost());

    System.out.println();

    System.out.println("2. Text Formatting Decorator Pattern:");

    TextComponent text = new PlainText("Hello World");
    System.out.println("Plain: " + text.render());

    text = new BoldTextDecorator(text);
    System.out.println("Bold: " + text.render());

    text = new ItalicTextDecorator(text);
    System.out.println("Bold + Italic: " + text.render());

    text = new UnderlineTextDecorator(text);
    System.out.println("Bold + Italic + Underline: " + text.render());

    TextComponent formattedText = new UnderlineTextDecorator(
        new BoldTextDecorator(
            new PlainText("Design Patterns")));
    System.out.println("Formatted: " + formattedText.render());

    System.out.println();

    System.out.println("3. Vehicle Feature Decorator Pattern:");

    Vehicle car = new BasicCar();
    System.out.println(car.getDescription());
    System.out.println("Price: $" + car.getPrice() + ", Horsepower: " + car.getHorsepower());

    car = new TurboEngineDecorator(car);
    System.out.println("\n" + car.getDescription());
    System.out.println("Price: $" + car.getPrice() + ", Horsepower: " + car.getHorsepower());

    car = new GPSNavigationDecorator(car);
    System.out.println("\n" + car.getDescription());
    System.out.println("Price: $" + car.getPrice() + ", Horsepower: " + car.getHorsepower());

    car = new LeatherSeatsDecorator(car);
    System.out.println("\n" + car.getDescription());
    System.out.println("Price: $" + car.getPrice() + ", Horsepower: " + car.getHorsepower());

    Vehicle luxuryCar = new LeatherSeatsDecorator(
        new GPSNavigationDecorator(
            new TurboEngineDecorator(
                new BasicCar())));
    System.out.println("\nLuxury Car: " + luxuryCar.getDescription());
    System.out.println("Price: $" + luxuryCar.getPrice() + ", Horsepower: " + luxuryCar.getHorsepower());

    System.out.println();

    System.out.println("4. Decorator Pattern Benefits:");
    System.out.println("- Dynamic composition of features");
    System.out.println("- No need for multiple inheritance");
    System.out.println("- Can add/remove features at runtime");
    System.out.println("- Open/Closed principle - open for extension, closed for modification");

    Vehicle sportsCar = new TurboEngineDecorator(new BasicCar());
    Vehicle familyCar = new GPSNavigationDecorator(new LeatherSeatsDecorator(new BasicCar()));

    System.out.println("\nSports Car: " + sportsCar.getDescription() + " - $" + sportsCar.getPrice());
    System.out.println("Family Car: " + familyCar.getDescription() + " - $" + familyCar.getPrice());
  }
}