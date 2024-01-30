package corePatterns;

//Shape class
class Shape {
 void draw() {
     System.out.println("Drawing a shape");
 }
}

//Circle class (extends Shape)
class Circle extends Shape {
 @Override
 void draw() {
     System.out.println("Drawing a Circle");
 }
}

//Square class (extends Shape)
class Square extends Shape {
 @Override
 void draw() {
     System.out.println("Drawing a Square");
 }
}

//ShapeFactory class
class ShapeFactory {
 Shape createShape(String type) {
     if ("Circle".equalsIgnoreCase(type)) {
         return new Circle();
     } else if ("Square".equalsIgnoreCase(type)) {
         return new Square();
     } else {
         throw new IllegalArgumentException("Invalid shape type: " + type);
     }
 }
}

public class FactoryMethodPatternExample {
 public static void main(String[] args) {
     // Using the factory to create shapes
     ShapeFactory shapeFactory = new ShapeFactory();

     Shape circle = shapeFactory.createShape("Circle");
     circle.draw();

     Shape square = shapeFactory.createShape("Square");
     square.draw();
 }
}
