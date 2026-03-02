import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int bookID;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập mã sách (4 chữ số): ");
        bookID = sc.nextInt();

        int donVi = bookID % 10;
        System.out.println("Chữ số kiểm tra kì vọng: ");
        System.out.println(donVi);

        int thousands = bookID / 1000;
        int hundreds = (bookID / 100) % 10;
        int dozens = (bookID / 10) % 10;

        int sumOfFirstThreeNumber = thousands + hundreds + dozens;
        System.out.print("Kq kiểm tra mã sách: ");
        if (sumOfFirstThreeNumber == donVi){
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}