# Design Patterns Examples - Java (Part of  Full Stack Class)

This project is part of the Full Stack Classes and is designed to help you learn two important object-oriented design patterns in Java: **Singleton** and **Decorator**. These examples are for educational purposes and are not intended for full production use.

### Singleton Pattern (Creational)
The singleton pattern ensures that a class has only one instance and provides a global point of access to it. This is useful for managing shared resources like database connections, logging, or configuration settings.

### Decorator Pattern (Structural)
The decorator pattern allows behavior to be added to individual objects, either statically or dynamically, without affecting the behavior of other objects from the same class. This is useful for adding features like formatting, logging, or additional functionalities to existing classes.

**Note:** These examples are for learning and practice as part of the Full Stack Classes. They are not meant for full production use, but to help you understand the patterns and how to apply them in real projects.

## Project Structure

```
src/main/java/patterns/
├── singleton/                         # Singleton Pattern Examples
│   ├── DatabaseConnection.java        # Eager Initialization Singleton
│   ├── Logger.java                    # Thread-Safe Lazy Initialization Singleton  
│   ├── ConfigurationManager.java      # Bill Pugh Singleton Pattern
│   └── SingletonDemo.java             # Demonstration class
├── decorator/                         # Decorator Pattern Examples
│   ├── Coffee.java                    # Coffee decorator example (classic)
│   ├── SimpleCoffee.java
│   ├── CoffeeDecorator.java
│   ├── MilkDecorator.java
│   ├── SugarDecorator.java
│   ├── WhippedCreamDecorator.java
│   ├── TextComponent.java             # Text formatting decorator example
│   ├── PlainText.java
│   ├── TextDecorator.java
│   ├── BoldTextDecorator.java
│   ├── ItalicTextDecorator.java
│   ├── UnderlineTextDecorator.java
│   ├── Vehicle.java                   # Vehicle feature decorator example
│   ├── BasicCar.java
│   ├── VehicleDecorator.java
│   ├── TurboEngineDecorator.java
│   ├── GPSNavigationDecorator.java
│   ├── LeatherSeatsDecorator.java
│   └── DecoratorDemo.java             # Demonstration class
└── PatternRunner.java                 # Main runner class
```

## Pattern Implementations

### Singleton Pattern (3 Examples)

#### 1. DatabaseConnection - Eager Initialization
- **Thread-safe**: Yes (instance created at class loading)
- **Lazy loading**: No
- **Use case**: When singleton creation is not expensive and always needed
- **Features**: Database connection management with query execution

#### 2. Logger - Thread-Safe Lazy Initialization  
- **Thread-safe**: Yes (synchronized method)
- **Lazy loading**: Yes
- **Use case**: When thread safety is crucial and creation might be expensive
- **Features**: Logging with different levels (INFO, WARNING, ERROR, DEBUG)

#### 3. ConfigurationManager - Bill Pugh Singleton
- **Thread-safe**: Yes (using static inner class)
- **Lazy loading**: Yes
- **Use case**: Most efficient singleton implementation
- **Features**: Application configuration management with properties

### Decorator Pattern (3 Examples)

#### 1. Coffee Decorator - Classic Example
- **Components**: Coffee interface, SimpleCoffee base
- **Decorators**: Milk, Sugar, WhippedCream
- **Features**: Dynamic cost calculation and description building

#### 2. Text Formatting Decorator
- **Components**: TextComponent interface, PlainText base  
- **Decorators**: Bold, Italic, Underline formatting
- **Features**: HTML-style text formatting with nested decorations

#### 3. Vehicle Feature Decorator
- **Components**: Vehicle interface, BasicCar base
- **Decorators**: TurboEngine, GPSNavigation, LeatherSeats
- **Features**: Price and horsepower calculations with feature combinations

## How to Run

### Compile and Run All Examples
```bash
# Navigate to the project directory
cd your_project_directory

# Compile all Java files
find src -name "*.java" -exec javac -cp src {} \;

# Run the main demonstration
java -cp src patterns.PatternRunner
```

### Run Individual Demonstrations
```bash
# Run only Singleton examples
java -cp src patterns.singleton.SingletonDemo

# Run only Decorator examples  
java -cp src patterns.decorator.DecoratorDemo
```
