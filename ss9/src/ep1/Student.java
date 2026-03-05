package ep1;

public class Student extends Person {
    private final String maSV;
    private final double diemTB;

    public Student(String hoTen, int tuoi, String maSV, double diemTB) {
        super(hoTen, tuoi);
        this.maSV = maSV;
        this.diemTB = diemTB;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Ma SV: " + maSV);
        System.out.println("Diem TB: " + diemTB);
    }
}
