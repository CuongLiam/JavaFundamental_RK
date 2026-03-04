package ss2_redo;

import java.util.Scanner;

public class ss2ep4 {
    public static void ep4(){
        Scanner sc = new Scanner(System.in);

        int id;

        do {
            System.out.println("Nhap ma ID");
            id = sc.nextInt();

            System.out.println("Mã không hợp lệ, hãy nhập lại");

        } while (id <= 0);

        System.out.println("Lưu mã sách thành công, ID = "+id);


    }
}
