package ss6ep1;

public class Student {
    int id;
    String name;
    String dob;
    double grade;

    public Student(int id, String name, String dob, double grade) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", grade=" + grade +
                '}';
    }
}
