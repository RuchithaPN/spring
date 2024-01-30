package demo;

class Parent {
    public Parent() {
        System.out.println(" Parent class");
    }
}

class Child extends Parent {
    public Child() {
        super(); // This implicitly calls the constructor of the Parent class
        System.out.println(" Child class");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
