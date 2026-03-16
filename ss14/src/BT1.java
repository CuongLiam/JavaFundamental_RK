import java.util.LinkedHashSet;
import java.util.Set;

public class BT1 {
    public static void main(String[] args) {
        Set<String> Patients = new LinkedHashSet<>();
        Patients.add("Nguyen Van A");
        Patients.add("Le Thi B");
        Patients.add("Tran Van C");
        Patients.add("Nguyen Van A");

        System.out.println("Danh sach benh nhan:");
        for (String patient : Patients) {
            System.out.println(patient);
        }
    }
}