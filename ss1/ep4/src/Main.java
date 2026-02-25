import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double bookPrice;
        double exchangeRate = 25450.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("nhập giá sách (USD)");
        bookPrice = sc.nextDouble();
        System.out.println("Giá chính xác ra VND số thực: "+(bookPrice*exchangeRate));

        System.out.println("Giá làm tròn để thanh toán: "+(long)(exchangeRate * bookPrice));

        sc.close();
    }
}