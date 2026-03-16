import java.util.*;

public class BT6 {
    public class Patient {
        public String patientName;
        public int age;
        public String department;

        public Patient(String patientName, int age, String department) {
            this.patientName = patientName;
            this.age = age;
            this.department = department;
        }

        @Override
        public String toString() {
            return patientName;
        }
    }

    public static void main(String[] args) {
        List<Patient> patients = List.of(
                new BT6().new Patient("Nguyen Van A", 30, "Tim Mach"),
                new BT6().new Patient("Le Thi B", 45, "Noi Tiet"),
                new BT6().new Patient("Tran Van C", 40, "Tim Mach")
        );

        Map<String, List<Patient>> departmentMap = new HashMap<>();

        for (Patient p : patients) {
            if (!departmentMap.containsKey(p.department)) {
                departmentMap.put(p.department, new ArrayList<>());
            }
            departmentMap.get(p.department).add(p);
        }

        String khoaDongNhat = "";
        int soBenhNhanMax = 0;

        for (String khoa : departmentMap.keySet()) {

            int soBenhNhan = departmentMap.get(khoa).size();

            if (soBenhNhan > soBenhNhanMax) {
                soBenhNhanMax = soBenhNhan;
                khoaDongNhat = khoa;
            }
        }

        System.out.println("Khoa " + khoaDongNhat + " dang dong nhat (" + soBenhNhanMax + " benh nhan)");
    }
}