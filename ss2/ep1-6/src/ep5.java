import java.util.Scanner;

public class ep5 {
    public static void ss2ep5(){
        Scanner sc = new Scanner(System.in);
        int uyTin = 100;
        System.out.println("Nhap so ngay tre han: ");

        while (true) {

            System.out.print("Nhap so ngay tre lan nay: ");
            int ngayTre = sc.nextInt();

            if (ngayTre == 999) {
                System.out.println("Ket thuc chuong trinh.");
                break;
            }

            if (ngayTre <= 0) {
                uyTin += 5;
                System.out.println("Tra dung han. Uy tin tang len 5 diem. Uy tin hien tai: " + uyTin);
            }
            else {
                int diemTru = ngayTre * 2;
                uyTin -= diemTru;
                System.out.println("Tra tre " + ngayTre + " ngay. Uy tin bi tru " + diemTru + " diem. Uy tin hien tai: " + uyTin);
            }
        }

        System.out.println("Uy tin cuoi cung: " + uyTin);

        if (uyTin > 120) {
            System.out.println("Xep loai: Doc gia than thiet");
        }
        else if (uyTin >= 80) {
            System.out.println("Xep loai: Doc gia tieu chuan");
        }
        else {
            System.out.println("Xep loai: Doc gia can luu y");
        }

        sc.close();
    }
}
