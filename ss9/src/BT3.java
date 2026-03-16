public class BT3 {
    class Employee {
        private final String ten;
        private final double luong;

        public Employee(String ten, double luong) {
            this.ten = ten;
            this.luong = luong;
        }

        public void display() {
            System.out.println("Ten: " + ten);
            System.out.printf("Luong: %.2f%n", luong);
        }
    }

    class Manager extends Employee {
        private final String phongBan;

        public Manager(String ten, double luong, String phongBan) {
            super(ten, luong);
            this.phongBan = phongBan;
        }

        @Override
        public void display() {
            super.display();
            System.out.println("Phong ban: " + phongBan);
        }
    }

    public static void main(String[] args) {
        BT3 bt3 = new BT3();
        Employee emp = bt3.new Employee("Nguyen Van A", 5000.0);
        Manager mgr = bt3.new Manager("Le Thi B", 8000.0, "IT");

        System.out.println("Thong tin nhan vien:");
        emp.display();
        System.out.println();

        System.out.println("Thong tin quan ly:");
        mgr.display();
    }
}