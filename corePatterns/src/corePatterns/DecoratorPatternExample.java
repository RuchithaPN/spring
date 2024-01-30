package corePatterns;

//Component - Coffee
class Coffee {
 String getDescription() {
     return "Simple Coffee";
 }

 double cost() {
     return 2.0;
 }
}

//Decorator - Milk
class MilkDecorator extends Coffee {
 private Coffee decoratedCoffee;

 MilkDecorator(Coffee decoratedCoffee) {
     this.decoratedCoffee = decoratedCoffee;
 }

 @Override
 String getDescription() {
     return decoratedCoffee.getDescription() + ", Milk";
 }

 @Override
 double cost() {
     return decoratedCoffee.cost() + 1.0;
 }
}

//Decorator - Sugar
class SugarDecorator extends Coffee {
 private Coffee decoratedCoffee;

 SugarDecorator(Coffee decoratedCoffee) {
     this.decoratedCoffee = decoratedCoffee;
 }

 @Override
 String getDescription() {
     return decoratedCoffee.getDescription() + ", Sugar";
 }

 @Override
 double cost() {
     return decoratedCoffee.cost() + 0.5;
 }
}

public class DecoratorPatternExample {
 public static void main(String[] args) {
     // Creating a simple coffee
     Coffee simpleCoffee = new Coffee();
     System.out.println("Cost: $" + simpleCoffee.cost() + ", Description: " + simpleCoffee.getDescription());

     // Decorating with Milk
     Coffee milkCoffee = new MilkDecorator(simpleCoffee);
     System.out.println("Cost: $" + milkCoffee.cost() + ", Description: " + milkCoffee.getDescription());

     // Decorating with Sugar
     Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
     System.out.println("Cost: $" + sugarMilkCoffee.cost() + ", Description: " + sugarMilkCoffee.getDescription());
 }
}
