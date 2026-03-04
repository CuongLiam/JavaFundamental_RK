/**
 * Lớp Student quản lý thông tin cơ bản của sinh viên.
 * Sử dụng tính đóng gói (Encapsulation) để bảo vệ dữ liệu.
 */
public class Student {
    private String studentId;      // Mã sinh viên
    private String studentName;    // Tên sinh viên
    private int age;               // Tuổi
    private String sex;            // Giới tính
    private double mark;           // Điểm số

    // Constructor không tham số
    public Student() {
    }

    // Constructor có đầy đủ tham số
    public Student(String studentId, String studentName, int age, String sex, double mark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.mark = mark;
    }

    // Getter và Setter cho studentId
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Getter và Setter cho studentName
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Getter và Setter cho age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter và Setter cho sex
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    // Getter và Setter cho mark
    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    // Hiển thị thông tin sinh viên
    public void displayData() {
        System.out.println("ID: " + studentId + " | Tên: " + studentName + 
                         " | Tuổi: " + age + " | Giới tính: " + sex + 
                         " | Điểm: " + mark);
    }

    @Override
    public String toString() {
        return "Thông tin sinh viên: {" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", mark=" + mark +
                '}';
    }
}
