import java.util.*;

public class BT6 {
    public class Medicine {
        private final String drugId;
        private final String drugName;
        private final double unitPrice;
        private int quantity;

        public Medicine(String drugId, String drugName, double unitPrice, int quantity) {
            this.drugId = drugId;
            this.drugName = drugName;
            this.unitPrice = unitPrice;
            this.quantity = quantity;
        }

        public String getDrugId() { return drugId; }
        public String getDrugName() { return drugName; }
        public double getUnitPrice() { return unitPrice; }
        public int getQuantity() { return quantity; }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public double getTotal() {
            return unitPrice * quantity;
        }

        @Override
        public String toString() {
            return drugId + " | " + drugName + " | " + unitPrice + " | " + quantity + " | " + getTotal();
        }
    }

    public class MedicineManager {
        public static ArrayList<Medicine> medicines = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        public void menu() {
            System.out.println("======== QUAN LI THUOC ========");
            System.out.println("1. Hien thi danh sach thuoc");
            System.out.println("2. Them thuoc moi");
            System.out.println("3. Cap nhat so luong thuoc");
            System.out.println("4. Xoa thuoc theo ID");
            System.out.println("5. Hien thi hoa don");
            System.out.println("6. Tim thuoc co don gia re nhat");
            System.out.println("7. Thoat");
            System.out.println("==============================");
            System.out.print("Lua chon cua ban: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> { showList(); break;}
                case 2 -> { addMedicine(); break;}
                case 3 -> { updateQuantity(); break; }
                case 4 -> { deleteMedicine(); break; }
                case 5 -> { printBill(); break; }
                case 6 -> { findCheapMedicine(); break; }
                case 7 -> { System.out.println("Thoat chuong trinh!"); System.exit(0); }
                default -> System.out.println("Lua chon khong hop le!");
            }
        }

        public void showList() {
            if (medicines.isEmpty()) {
                System.out.println("Danh sach thuoc rong!");
                return;
            }
            System.out.println("Danh sach thuoc:");
            System.out.println("ID | Ten thuoc | Don gia | So luong | Thanh tien");
            for (Medicine medicine : medicines) {
                System.out.println(medicine);
            }
        }

        public void addMedicine() {
            System.out.print("Nhap ID thuoc: ");
            String drugId = sc.nextLine();
            System.out.print("Nhap ten thuoc: ");
            String drugName = sc.nextLine();
            System.out.print("Nhap don gia: ");
            double unitPrice = sc.nextDouble();
            System.out.print("Nhap so luong: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Medicine medicine = new Medicine(drugId, drugName, unitPrice, quantity);
            medicines.add(medicine);

            System.out.println("Da them thuoc moi thanh cong!");
        }

        public void updateQuantity() {
            System.out.print("Nhap ID thuoc can cap nhat: ");
            String drugId = sc.nextLine();
            for (Medicine medicine : medicines) {
                if (medicine.getDrugId().equals(drugId)) {
                    System.out.print("Nhap so luong moi: ");
                    int newQuantity = sc.nextInt();
                    sc.nextLine();
                    medicine.setQuantity(newQuantity);
                    return;
                }
            }
            System.out.println("Khong tim thay thuoc!");
        }

        public void deleteMedicine() {
            System.out.print("Nhap ID thuoc can xoa: ");
            String drugId = sc.nextLine();
            for (Medicine medicine : medicines) {
                if (medicine.getDrugId().equals(drugId)) {
                    medicines.remove(medicine);
                    System.out.println("Da xoa thuoc thanh cong!");
                    return;
                }
            }
            System.out.println("Khong tim thay thuoc!");
        }

        public void printBill() {
            double totalAmount = 0;
            System.out.println("Hoa don:");
            for (Medicine medicine : medicines) {
                System.out.println(medicine);
                totalAmount += medicine.getTotal();
            }
            System.out.printf("Tong tien phai tra: %.2f%n", totalAmount);
        }

        public void findCheapMedicine() {
            if (medicines.isEmpty()) {
                System.out.println("Danh sach thuoc rong!");
                return;
            }

            int count = 0;
            for (Medicine medicine : medicines) {
                if (medicine.getUnitPrice() < 10000) {
                    System.out.println(medicine);
                    count++;
                }
            }

            if (count == 0) {
                System.out.println("Khong co thuoc nao co don gia re hon 10000!");
            }
        }
    }

    public static void main(String[] args) {
        BT6 bt6 = new BT6();
        MedicineManager medicineManager = bt6.new MedicineManager();
        while (true) {
            medicineManager.menu();
        }
    }
}