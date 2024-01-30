package demo1;

class ParentClass {
   
    ParentClass() {
        System.out.println("ParentClass  called");
    }
}

class ChildClass extends ParentClass {
    ChildClass() {
        System.out.println("ChildClass called");
    }
}

public class New {
    public static void main(String[] args) {
        ChildClass childObj = new ChildClass();

        System.out.println("Hash code of ParentClass object: " + childObj.hashCode());
        System.out.println("Hash code of ChildClass object: " + childObj.hashCode());
    }
}
