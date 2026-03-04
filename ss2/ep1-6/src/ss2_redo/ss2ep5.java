package ss2_redo;

import java.util.Scanner;

public class ss2ep5 {
    public static void ep5(){
        Scanner sc = new Scanner(System.in);
        int credit = 100;

        System.out.println("hệ thống đánh giá độc giả===============");

        int lateDays = 0;
        while (lateDays != 999){
            System.out.println("Nhap so ngay tre, nhap 999 de ket thuc");
            System.out.print("So ngay tre cua lan nay: ");
            lateDays = sc.nextInt();

            if (lateDays == 999) continue;
            if (lateDays > 0){
                credit = credit - (lateDays * 2);
                System.out.println("Tra tre "+lateDays+" ngay: -"+lateDays*2+" diem");
            } else{
                credit += 5;
            }
        }

        System.out.println("Tong diem uy tin: "+credit);
        if (credit >= 120){
            System.out.println("Doc gia than thiet");
        } else if (credit >= 80 && credit < 120){
            System.out.println("Doc gia tieu chuan");
        } else {
            System.out.println("Doc gia can chu y");
        }
    }
}
