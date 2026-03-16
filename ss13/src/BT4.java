import java.util.LinkedList;

public class BT4 {
    class EmergencyRoom {
        private final LinkedList<String> queue = new LinkedList<>();

        public void normalPatient(String name) {
            queue.addLast(name);
        }

        public void emergencyPatient(String name) {
            queue.addFirst(name);
        }

        public void treatPatient() {
            if (!queue.isEmpty()) {
                String treatedPatient = queue.removeFirst();
                System.out.println("Dang dieu tri cho benh nhan: " + treatedPatient);
            } else {
                System.out.println("Khong co benh nhan nao de dieu tri!");
            }
        }
    }

    public static void main(String[] args) {
        BT4 bt4 = new BT4();
        EmergencyRoom er = bt4.new EmergencyRoom();

        er.normalPatient("Alice");
        er.normalPatient("Bob");
        er.emergencyPatient("Charlie");
        er.normalPatient("David");
        er.emergencyPatient("Eve");

        er.treatPatient();
        er.treatPatient();
        er.treatPatient();
        er.treatPatient();
        er.treatPatient();
        er.treatPatient();
    }
}