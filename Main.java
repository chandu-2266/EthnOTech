class Employee {
    String role;
    double salary;

    void work() {
        System.out.println("Employee is working");
    }

    void displayInfo() {
        System.out.println("Role: " + role);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    void manage() {
        System.out.println("Manager is managing");
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.role = "Manager";
        m.salary = 75000.0;

        m.work();
        m.manage();
        m.displayInfo();
    }
}