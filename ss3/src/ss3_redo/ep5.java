package ss3_redo;

public class ep5 {


    public static void ep5Main(){
        int[] books = new int[]{100, 211, 213, 123, 2130};

        for (int i = 0; i < books.length; i++){
            System.out.print(books[i]+ " ");
        }

        System.out.println();
        deleteBook(books, books.length, 213);

        for (int i = 0; i < books.length; i++){
            System.out.print(books[i]+ " ");
        }

    }

    static void deleteBook(int[] arr, int n, int bookId){
        int pos = -1;

        for (int idx = 0; idx < n; idx++) {
            if (arr[idx] == bookId) {
                pos = idx;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Khong tim thay sach co ma " + bookId);
            return ;
        }

        for (int j = pos; j < n - 1; j++) {
            arr[j] = arr[j + 1];
        }

        System.out.println("Da xoa sach co ma " + bookId + " thanh cong!");
    }
}
