class Employee {
    String name;
    String department;

    // Initializer Block
    {
        System.out.println("Employee Registration Started");
    }

    // No-argument constructor
    Employee() {
        this("Unknown");
    }

    // Constructor with employee name
    Employee(String name) {
        this(name, "General");
    }

    // Constructor with employee name and department
    Employee(String name, String department) {
        this.name = name;
        this.department = department;

        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

public class Employee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Raj", "IT");
    }
}