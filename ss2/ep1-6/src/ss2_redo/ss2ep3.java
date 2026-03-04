package ss2_redo;

import java.util.Scanner;

public class ss2ep3 {
    public static void ep3(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so sach tra muon: ");
        int n = sc.nextInt();

        int total = 0;
        for (int i = 1; i <= n; i++){
            System.out.println("Nhap so ngay tre cua cuon thu "+i+": ");
            total += sc.nextInt();

            if (total < 0){
                System.out.println("Ko hop le!");
                break;
            }
        }

        System.out.println("==>>> so tien phat : "+total*5000);
    }
}
