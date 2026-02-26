import java.util.Scanner;

public class ep2 {
    public static void ss2ep2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ki tu (A, B, C, D): ");
        char code = sc.next().charAt(0);

        switch (code) {
            case 'A' -> System.out.println("Tang 1 - Sach Van Hoc");
            case 'B' -> System.out.println("Tang 2 - Sach Khoa Hoc");
            case 'C' -> System.out.println("Tang 3 - Sach Ngoai Ngu");
            case 'D' -> System.out.println("Tang 4 - Sach Tin Hoc");
            default -> System.out.println("Ki tu khong hop le!");
        }

        sc.close();
    }
}
