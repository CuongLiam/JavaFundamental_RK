package ss3_redo;

import java.util.Scanner;

public class ep2 {
    public static void ep2Main(){
        String[] books = new String[5];
        books = new String[]{"Doraemon", "ABC", "123", "453", "sda"};

//        for (String book : books) {
//            System.out.println(book);
//        }

        System.out.println("Nhập tên sách cần tìm: ");
        Scanner sc = new Scanner(System.in);
        String search = sc.nextLine();

        int res = searchBooks(books, search);

        if (res != -1){
            System.out.println("Found sach '"+search+"' tai vi tri so: "+res);
        } else {
            System.out.println("Sach k ton tai");
        }

    }
    static int searchBooks(String[] arr, String search){
        for (int i = 0; i < arr.length; i++){
            if (arr[i].equalsIgnoreCase(search)) return i;
        }
        return -1;
    }
}
