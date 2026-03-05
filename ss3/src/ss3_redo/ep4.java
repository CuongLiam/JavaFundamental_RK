package ss3_redo;

import java.util.Arrays;

public class ep4 {
    public static void ep4Main(){
        int[] books = new int[]{213,4124,234,123,3,4256,73,34};

        System.out.println("before: ");

        displayBooks(books);

        System.out.println("\nafter: ");

        System.out.println(Arrays.toString(sortBooks(books)));;
        displayBooks(books);

    }

    static int[] sortBooks(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    static void displayBooks(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
