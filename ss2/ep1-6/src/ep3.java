import java.util.Scanner;

public class ep3 {
    public static void ss2ep3(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong sach tra muon: ");
        int n = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhap so ngay tre cua cuon sach thu " + i + ": ");
            int daysLate = sc.nextInt();

            total += daysLate * 5000;
        }

        System.out.println("TTong so tien phat: " + total + " VND");

        sc.close();
    }
}
