import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String bookID;
        String bookName;
        int publishYear;
        double price;
        boolean isAvailable;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã sách: ");
        bookID = scanner.nextLine();
        System.out.print("Nhập tên sách: ");
        bookName = scanner.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        publishYear = scanner.nextInt();
        System.out.print("Nhập giá bìa: ");
        price = scanner.nextDouble();
        System.out.print("Sách còn trong kho(True/False): ");
        isAvailable = scanner.nextBoolean();

        displayBookInfo(bookID, bookName, publishYear, price, isAvailable);

//        loop_test.loop1();
    }

    static void displayBookInfo(String bookID, String bookName, int publishYear,
                                double price, boolean isAvailable){
        int tuoiTho = 2026 - publishYear;

        System.out.println("======Phiếu thông tin sách=======");
        System.out.println("tên sách: "+bookName);
        System.out.println("Mã số: "+bookID+"| Tuổi thọ: "+tuoiTho);
        System.out.printf("Giá bán: %.2f\n",price);
        System.out.println("Tình trạng: "+(isAvailable ? "Còn sách" : "hết sách"));
    }
}