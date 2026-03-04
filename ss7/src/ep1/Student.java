package ep1;

public class Student {
    int id;
    String name;


    static int totalStudent = 0;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;

        totalStudent++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void displayTotalStudent(){
        System.out.println("total: "+ totalStudent);
    }
}
