package ss3_redo;

import java.util.Scanner;

public class ep1 {
    static int[] bookIds;

    public static void ep1Main(){
        Scanner sc = new Scanner(System.in);
//        int[] arr = {1,2,3,4,5};
//        int[] arr2 = new int[] {1, 2, 3, 4, 5};

        System.out.println("Nhap so luong sach can quan ly: ");
        int n = sc.nextInt();

        addBookToLibraries(n);
        displayLibraries(bookIds);

    }

    protected static void addBookToLibraries(int n){
        Scanner sc = new Scanner(System.in);

        bookIds = new int[n];
        System.out.println("Nhap ma so cho "+n+" cuon sach");
        for (int i = 0; i < n; i++){
            System.out.println("sach thu "+ (i+1));
            bookIds[i] = sc.nextInt();
        }
    }

    protected static void displayLibraries(int[] arr){
        System.out.println("Ket qua====");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        for (int j : arr) {
            System.out.print(j+ " ");
        }
    }
}
