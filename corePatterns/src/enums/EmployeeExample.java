package enums;

public class EmployeeExample {
    public static void main(String[] args) {
        // Accessing employee types
        EmployeeType manager = EmployeeType.MANAGER;
        EmployeeType developer = EmployeeType.DEVELOPER;

        // Example usage
        System.out.println("Manager Role: " + manager.getRole());
        System.out.println("Manager Responsibilities: " + manager.getResponsibilities());

        System.out.println("\nDeveloper Role: " + developer.getRole());
        System.out.println("Developer Responsibilities: " + developer.getResponsibilities());
    }
}

