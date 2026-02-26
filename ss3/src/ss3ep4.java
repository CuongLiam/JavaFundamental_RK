public class ss3ep4 {
    public static int[] sortBooksByCode(int[] books) {
        int n = books.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (books[j] > books[j + 1]) {
                    int temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
        return books;
    }

    public static void displayBooksCode(int[] books) {
        System.out.println("Danh sach ma sach sau khi sap xep: ");
        for (int i = 0; i < books.length; i++) {
            System.out.println("Sach thu " + (i + 1) + ": " + books[i]);
            if (i < books.length - 1) {
                System.out.println(", ");
            }
        }
    }
    public static void ep4() {
        int[] books = { 102, 56, 78, 34, 89, 23, 67 };

        int[] sortedBooks = sortBooksByCode(books);
        displayBooksCode(sortedBooks);
    }
}
