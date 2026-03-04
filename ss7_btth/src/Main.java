public class Main {
    public static void main(String[] args) {
        Student stu1 = new Student("1", "Nguyen Van A");
        stu1.displayInfo();

        System.out.println(Student.studentCount);
        System.out.println(Student.SCHOOL_NAME);


        Student stu2 = new Student("2", "hello nguyen");
        stu2.displayInfo();



        Student.showTotalStudent();

    }
}