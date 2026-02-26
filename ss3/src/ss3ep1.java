import java.util.Scanner;

public class ss3ep1 {
    public static int[] addBookToLibrary(int n) {
        @SuppressWarnings("ConvertToTryWithResources")
        Scanner sc = new Scanner(System.in);
        int[] books = new int[n];

        System.out.println("Nhap ma cho " + n + " cuon sach:");
        for (int i = 0; i < n; i++) {
            System.out.println("Sach thu " + (i + 1) + ": ");
            books[i] = sc.nextInt();
        }
        sc.close();
        return books;
    }

    public static void displayLibrary(int[] books) {
        System.out.println("Danh sach cac ma sach: ");
        for (int i = 0; i < books.length; i++) {
            System.out.println("Sach thu " + (i + 1) + ": " + books[i]);
            if (i < books.length - 1) {
                System.out.println("-------------");
            }
        }
    }

    public static void ep1(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong sach can them vao thu vien: ");
        int n = sc.nextInt();

        int[] libraryBooks = addBookToLibrary(n);

        System.out.println("\n------ Thu vien sau khi them sach -----");
        displayLibrary(libraryBooks);

        sc.close();
    }
}
