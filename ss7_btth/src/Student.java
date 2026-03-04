public class Student {
    private String id;
    private String name;

    static int studentCount;
    static final String SCHOOL_NAME = "ABC University";

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        studentCount++;
    }

    void displayInfo(){
        System.out.println("Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}');
    }

    static void showTotalStudent(){
        System.out.println(studentCount);
    }
}
