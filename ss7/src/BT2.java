public class BT2 {
    static class Student {
        String fullName;

        public Student(String fullName) {
            this.fullName = fullName;
        }

        public void displayInfo() {
            System.out.println("Ho va ten: " + fullName);
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Nguyen Van E");

        System.out.println("Thong tin sinh vien:");
        student.displayInfo();

        int a = 10;
        // int b = a;
        int b = 20;

        System.out.println("Gia tri a: " + a);
        System.out.println("Gia tri b: " + b);

        Student student2 = student;
        student2.fullName = "Le Thi F";

        System.out.println("Ho va ten sinh vien sau khi thay doi thong qua student2:");
        student.displayInfo();
        student2.displayInfo();
    }
}