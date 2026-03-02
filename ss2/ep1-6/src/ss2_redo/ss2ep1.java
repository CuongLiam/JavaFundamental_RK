package ss2_redo;

import java.util.Scanner;

public class ss2ep1 {
    public static void ep1(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tuổi: ");
        int age = sc.nextInt();
        System.out.println("Nhập số sách đang mượn");
        int borrowedBooks = sc.nextInt();

        if (age >= 18 && borrowedBooks <= 3){
            System.out.println("Cho phép mượn sách");
        } else if (age < 18)    {
            System.out.println("Bạn chưa đủ tuổi: "+age);
        } else{
            System.out.println("Bạn đã mượn quá số lượng cho phép: "+borrowedBooks);
        }
    }
}
