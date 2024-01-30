package solid;
/*// Superclass
class Shape {
    int calculateArea() {
        return 0;
    }
}

// Subclass
class Rectangle extends Shape {
    private int length;
    private int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    int calculateArea() {
        return length * width;
    }
}

// Another Subclass
class Triangle extends Shape {
    private int base;
    private int height;

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    int calculateArea() {
        return (int) (0.5 * base * height);
    }
}

//  code without Liskov Substitution
public class ShapeAreaCalculator {
    static void printArea(Shape shape) {
        System.out.println("Area: " + shape.calculateArea());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        Triangle triangle = new Triangle(3, 6);

        printArea(rectangle); 
        printArea(triangle); 
    }
}
*/

//Superclass
class Shape {
 int calculateArea() {
     return 0;
 }
}

//Subclass
class Rectangle extends Shape {
 private int length;
 private int width;

 Rectangle(int length, int width) {
     this.length = length;
     this.width = width;
 }

 @Override
 int calculateArea() {
     return length * width;
 }
}

//Another Subclass
class Triangle extends Shape {
 private int base;
 private int height;

 Triangle(int base, int height) {
     this.base = base;
     this.height = height;
 }

 @Override
 int calculateArea() {
     return (int) (0.5 * base * height);
 }
}

// code with Liskov Substitution
public class ShapeAreaCalculator {
 static void printArea(Shape shape) {
     System.out.println("Area: " + shape.calculateArea());
 }

 public static void main(String[] args) {
     Shape rectangle = new Rectangle(4, 5); // Use the superclass type
     Shape triangle = new Triangle(3, 6);   // Use the superclass type

     printArea(rectangle); 
     printArea(triangle); 
 }
}
