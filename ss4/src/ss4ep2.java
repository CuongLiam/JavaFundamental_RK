import java.util.Scanner;

public class ss4ep2 {
    public static void formatString(String str) {
        if (str.contains("Kệ:")) {
            int start = str.indexOf("Kệ:") + 3;

            int end = str.indexOf(",", start);

            String location = str.substring(start, end).trim();

            System.out.println("Vị trí tìm thấy: " + location);

            String formattedStr = str.replace("Kệ", "Vị trí lưu trữ");

            System.out.println("\nMô tả mới: " + formattedStr);
        }

        else {
            System.out.println("Không tìm thấy thông tin kệ sách.");
        }
    }

    public static void ep2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mô tả sách: ");
        String str = sc.nextLine();
        sc.close();
        formatString(str);
    }
}
