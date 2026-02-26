import java.util.Scanner;

public class ep4 {
    public static void ss2ep4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma ID sach moi (ID phai > 0): ");
        int bookID = sc.nextInt();

        do {
            System.out.print("Ma ID khong hop le! Vui long nhap lai (ID phai > 0): ");
            bookID = sc.nextInt();
        } while (bookID <= 0);

        System.out.println("Ma ID sach da nhap: " + bookID);

        sc.close();
    }
}
