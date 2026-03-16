import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Map<String, String> drugs = new HashMap<>();

        drugs.put("T01", "Paracetamol");
        drugs.put("T02", "Ibuprofen");
        drugs.put("T03", "Amoxicillin");
        drugs.put("T04", "Aspirin");
        drugs.put("T05", "Vitamin C");

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap ma thuoc: ");
            String input = sc.nextLine();

            if (drugs.containsKey(input)) {
                System.out.println("Ten thuoc: " + drugs.get(input));
            } else {
                System.out.println("Khong tim thay thuoc voi ma " + input);
            }
        }
    }
}