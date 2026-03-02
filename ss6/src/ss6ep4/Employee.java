package ss6ep4;

public class Employee {
    String employeeID;
    String fullName;
    double salary;

    public Employee() {
        this.employeeID = "NULL";
        this.fullName = "NULL";
        this.salary = 0.0;
    }

    public Employee(String employeeID, String fullName) {
        this.employeeID = employeeID;
        this.fullName = fullName;
    }

    public Employee(String employeeID, String fullName, double salary) {
        this.employeeID = employeeID;
        this.fullName = fullName;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Ma nhan vien: " + employeeID);
        System.out.println("Ho va ten: " + fullName);
        System.out.printf("Luong: %.2f%n", salary);
    }
}
