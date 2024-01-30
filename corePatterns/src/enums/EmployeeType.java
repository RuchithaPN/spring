package enums;

public enum EmployeeType {
    // Enum constants representing types of employees
    MANAGER("Manager", "Responsible for team management and project coordination"),
    DEVELOPER("Developer", "Writes code and contributes to software development"),
    TESTER("Tester", "Ensures software quality through testing");

    // Fields to store the role and responsibilities of each employee type
    private final String role;
    private final String responsibilities;

    // Private constructor to initialize fields
    private EmployeeType(String role, String responsibilities) {
        this.role = role;
        this.responsibilities = responsibilities;
    }

    // Getter methods
    public String getRole() {
        return role;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

}

