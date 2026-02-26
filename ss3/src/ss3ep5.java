public class ss3ep5 {
    public static int deleteBook(int[] books, int length, int bookCode) {
        int pos = -1;

        for (int idx = 0; idx < length; idx++) {
            if (books[idx] == bookCode) {
                pos = idx;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Khong tim thay sach co ma " + bookCode);
            return length;
        }

        for (int j = pos; j < length - 1; j++) {
            books[j] = books[j + 1];
        }

        System.out.println("Da xoa sach co ma " + bookCode + " thanh cong!");

        return length - 1;
    }

    public static void ep5() {
        int[] books = {101, 102, 103, 104, 105};
        int length = books.length;
        int bookCode = 102;

        length = deleteBook(books, length, bookCode);

        System.out.println("Danh sach ma sach sau khi xoa: ");
        for (int i = 0; i < length; i++) {
            System.out.println("Sach thu " + (i + 1) + ": " + books[i]);
        }
    }
}