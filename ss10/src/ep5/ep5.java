package ep5;

import java.util.ArrayList;
import java.util.List;

public class ep5 {
    public abstract class Employee {
        protected String employeeName;
        protected double baseSalary;

        public Employee(String employeeName, double baseSalary) {
            this.employeeName = employeeName;
            this.baseSalary = baseSalary;
        }

        public abstract double calculateSalary();
    }

    public interface Bonus {
        public double getBonus();
    }

    public class OfficeStaff extends Employee {
        public OfficeStaff(String employeeName, double baseSalary) {
            super(employeeName, baseSalary);
        }

        @Override
        public double calculateSalary() {
            return baseSalary;
        }
    }

    public class Manager extends Employee implements Bonus {
        private final double bonus;

        public Manager(String employeeName, double baseSalary, double bonus) {
            super(employeeName, baseSalary);
            this.bonus = bonus;
        }

        @Override
        public double calculateSalary() {
            return baseSalary + getBonus();
        }

        @Override
        public double getBonus() {
            return bonus;
        }
    }

    public static void ep5Main() {
        ep5 bt = new ep5();
        List<Employee> employees = new ArrayList<>();
        employees.add(bt.new OfficeStaff("Nguyen Van AA", 5000000.0));
        employees.add(bt.new Manager("TLiam Josh", 7000000.0, 2000000.0));

        for (Employee e : employees) {
            System.out.println("Luong cua " + e.employeeName + ": " + e.calculateSalary() + (e instanceof Bonus ? " (co thuong)" : ""));
        }
    }
}
