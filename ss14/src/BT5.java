import java.util.*;

public class BT5 {
    public class Patient {
        public String patientName;
        public int severityLevel;
        public int arrivalTime;

        public Patient(String patientName, int severityLevel, int arrivalTime) {
            this.patientName = patientName;
            this.severityLevel = severityLevel;
            this.arrivalTime = arrivalTime;
        }

        @Override
        public String toString() {
            return patientName + " (Muc do " + severityLevel + ", den luc " + (8 + arrivalTime / 60) + ":" +
                    String.format("%02d", arrivalTime % 60) + ")";
        }
    }

    public class PatientComparator implements Comparator<Patient> {
        @Override
        public int compare(Patient p1, Patient p2) {
            if (p1.severityLevel != p2.severityLevel) {
                return Integer.compare(p1.severityLevel, p2.severityLevel);
            } else {
                return Integer.compare(p1.arrivalTime, p2.arrivalTime);
            }
        }
    }

    public static void main(String[] args) {
        BT5 bt = new BT5();
        Set<Patient> patients = new TreeSet<>(bt.new PatientComparator());
        patients.add(bt.new Patient("Nguyen Van A", 3, 30));
        patients.add(bt.new Patient("Tran Thi B", 2, 15));
        patients.add(bt.new Patient("Le Hoang C", 3, 10));
        patients.add(bt.new Patient("Pham Thi D", 1, 20));

        System.out.println("Thu tu xu li benh nhan:");
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }
}