import java.util.*;

public class BT5 {
    public class Patient {
        private String id;
        private String name;
        private int age;
        private String diagnosis;

        public Patient(String id, String name, int age, String diagnosis) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.diagnosis = diagnosis;
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return this.age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getDiagnosis() {
            return this.diagnosis;
        }

        public void setDiagnosis(String diagnosis) {
            this.diagnosis = diagnosis;
        }

        @Override
        public String toString() {
            return id + " | " + name + " | " + age + " | " + diagnosis;
        }

    }

    public class PatientManager {
        public static ArrayList<Patient> patients = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        public void showList() {
            if (patients.isEmpty()) {
                System.out.println("Khong co benh nhan trong danh sach!");
                return;
            }

            System.out.println("\n===== DANH SACH BENH NHAN =====");
            for (Patient p : patients) {
                System.out.println(p);
            }
        }

        public void addPatient() {
            System.out.println("Nhap ID cua benh nhan: ");
            String id = sc.nextLine();
            for (Patient p : patients) {
                if (p.getId().equals(id)) {
                    System.out.println("ID da ton tai! Vui long nhap lai.");
                    return;
                }
            }
            System.out.println("Nhap ten cua benh nhan: ");
            String name = sc.nextLine();
            System.out.println("Nhap tuoi cua benh nhan: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhap chan doan cua benh nhan: ");
            String diagnosis = sc.nextLine();

            patients.add(new Patient(id, name, age, diagnosis));
            System.out.println("Them benh nhan thanh cong!");
        }

        public void updateDiagnosis() {
            System.out.println("Nhap ID cua benh nhan can cap nhat chan doan: ");
            String id = sc.nextLine();
            for (Patient p : patients) {
                if (p.getId().equals(id)) {
                    System.out.println("Nhap chan doan benh nhan moi: ");
                    String newDiagnosis = sc.nextLine();
                    p.setDiagnosis(newDiagnosis);
                    System.out.println("Cap nhat chan doan thanh cong!");
                    return;
                }
            }
            System.out.println("Khong tim thay benh nhan!");
        }

        public void dischargePatient() {
            System.out.println("Nhap ID cua benh nhan can xuat vien: ");
            String id = sc.nextLine();
            for (Patient p : patients) {
                if (p.getId().equals(id)) {
                    patients.remove(p);
                    System.out.println("Xuat vien thanh cong!");
                    return;
                }
            }
            System.out.println("Khong tim thay benh nhan!");
        }

        public void sortPatients() {
            if (patients.isEmpty()) {
                System.out.println("Danh sach benh nhan dang trong!");
                return;
            }

            patients.sort(Comparator.comparing(Patient::getName));
            System.out.println("Danh sach benh nhan da duoc sap xep theo ten!");
            showList();
        }

        public void showMenu() {
            System.out.println("\n======= MENU =======");
            System.out.println("1. Them benh nhan");
            System.out.println("2. Cap nhat chan doan");
            System.out.println("3. Xuat vien");
            System.out.println("4. Sap xep danh sach");
            System.out.println("5. Thoat");
            System.out.println("====================");
            System.out.print("Lua chon cua ban: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> { addPatient(); break; }
                case 2 -> { updateDiagnosis(); break; }
                case 3 -> { dischargePatient(); break; }
                case 4 -> { sortPatients(); break; }
                case 5 -> {
                    System.out.println("Thoat chuong trinh!");
                    break;
                }
                default -> System.out.println("Lua chon khong hop le!");
            }
        }
    }

    public static void main(String[] args) {
        BT5 outer = new BT5();
        PatientManager manager = outer.new PatientManager();

        while (true) {
            manager.showMenu();
        }
    }
}