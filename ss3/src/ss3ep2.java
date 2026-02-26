import java.util.Scanner;

public class ss3ep2 {
    public static String[] addBooks(int n) {
        @SuppressWarnings("ConvertToTryWithResources")
        Scanner sc = new Scanner(System.in);

        String[] books = new String[n];
        System.out.println("Nhap ten cho " + n + " cuon sach:");

        for (int i = 0; i < n; i++) {
            System.out.print("Sach thu " + (i + 1) + ": ");
            books[i] = sc.nextLine();
        }
        sc.close();
        return books;
    }

    public static void findIndexBook(String[] books) {
        @SuppressWarnings("ConvertToTryWithResources")
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ten sach can tim: ");
        String targetBook = sc.nextLine();

        sc.close();

        for (int i = 0; i < books.length; i++) {
            if (books[i].equalsIgnoreCase(targetBook)) {
                System.out.println("Sach \"" + targetBook + "\" duoc tim thay o vi tri thu " + (i + 1));
                return;
            }
        }
        System.out.println("Khong tim thay sach \"" + targetBook + "\" trong danh sach.");
    }

    public static void ep2(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong sach: ");
        int n = sc.nextInt();

        String[] books = addBooks(n);
        findIndexBook(books);

        sc.close();
    }
}
