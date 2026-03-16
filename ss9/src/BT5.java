import java.util.ArrayList;
import java.util.List;

public class BT5 {
    public abstract class Employee {
        protected String employeeName;

        public Employee(String employeeName) {
            this.employeeName = employeeName;
        }

        public abstract double calculateSalary();
    }

    public class OfficeEmployee extends Employee {
        private double baseSalary = 0.0;

        public OfficeEmployee(String employeeName, double baseSalary) {
            super(employeeName);
            this.baseSalary = baseSalary;
        }

        @Override
        public double calculateSalary() {
            return baseSalary;
        }
    }

    public class ProductionEmployee extends Employee {
        private final int numberOfProducts;
        private final double price;

        public ProductionEmployee(String employeeName, int numberOfProducts, double price) {
            super(employeeName);
            this.numberOfProducts = numberOfProducts;
            this.price = price;
        }

        @Override
        public double calculateSalary() {
            return numberOfProducts * price;
        }
    }

    public static void main(String[] args) {
        BT5 bt = new BT5();
        List<Employee> employees = new ArrayList<>();
        employees.add(bt.new OfficeEmployee("Le Nguyen Quang Huy", 5000000.0));
        employees.add(bt.new ProductionEmployee("Tran Hoang Duy", 100, 15000.0));

        int index = 1;
        double totalSalary = 0.0;

        for (Employee e : employees) {
            System.out.println(index++ + ". " + e.employeeName + ": " + e.calculateSalary());
            totalSalary += e.calculateSalary();
        }

        System.out.println("So tien cong ty phai tra cho nhan vien: " + totalSalary);
    }
}