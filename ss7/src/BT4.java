public class BT4 {
    static class Classroom {
        static double classFund = 0;
        String studentName;

        public Classroom(String studentName) {
            this.studentName = studentName;
        }

        public String getStudentName() {
            return studentName;
        }

        public static void addFund(double amount) {
            classFund += amount;
            System.out.printf("Da them %.2f vao quy lop. Tong quy hien tai: %.2f%n", amount, classFund);
        }
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Classroom student1 = new Classroom("Nguyen Van A");
        @SuppressWarnings("unused")
        Classroom student2 = new Classroom("Le Thi B");

        Classroom.addFund(100.0);
        Classroom.addFund(150.0);
    }
}