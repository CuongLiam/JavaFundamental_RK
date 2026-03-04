package ss2_redo;

import java.util.Scanner;

public class ss2ep2 {
    public static void ep2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma khu vuc (A, B, C, D)");

        char choice = sc.next().charAt(0);
        switch (choice){
            case 'A':{
                System.out.println("Tầng 1: Sách Văn học");
                break;
            }
            case 'B':{
                System.out.println("Tầng 2: Sách Khoa học");
                break;
            }
            case 'C':{
                System.out.println("Tầng 3: Sách Ngoại ngữ");
                break;
            }
            case 'D':{
                System.out.println("Tầng 4: Sách Tin học");
                break;
            }
            default:
                break;

        }
    }
}
