package ss6ep4;

public class ep4 {
    public static void ep4Main(){
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("E001", "Nguyen Van A");
        Employee emp3 = new Employee("E002", "Le Thi B", 5000.0);

        System.out.println("Thong tin nhan vien 1:");
        emp1.displayInfo();
        System.out.println();

        System.out.println("Thong tin nhan vien 2:");
        emp2.displayInfo();
        System.out.println();

        System.out.println("Thong tin nhan vien 3:");
        emp3.displayInfo();
    }
}
