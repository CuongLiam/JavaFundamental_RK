package ep1;

public class Person {
    protected String hoTen;
    protected int tuoi;

    public Person(String hoTen, int tuoi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    public void display() {
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("Tuoi: " + tuoi);
    }
}
