package ss3_redo;

import java.util.Arrays;

public class ep6 {
    public static void ep6Main(){
        int[] arrayFirst, arraySecond;

        arrayFirst = new int[]{1, 3, 5, 7, 9};
        arraySecond = new int[]{2, 3, 5, 6, 8, 9, 10};


        int[] res = mergeBooks(arrayFirst, arraySecond);

        System.out.println(Arrays.toString(res));

    }

    static int[] mergeBooks(int[] a, int[] b){
        int[] temp = new int[a.length + b.length];
        int size = 0;

        for (int i = 0; i < a.length; i++){
            temp[size++] = a[i];
        }

        for (int i = 0; i < b.length; i++){
            temp[size++] = b[i];
        }

        Arrays.sort(temp);

        int[] arrayMerge = new int[temp.length];
        int arrayMergeSize = 0;

        for (int i = 0; i < size; i++){
            if (i == 0 || temp[i] != temp[i - 1]){
                arrayMerge[arrayMergeSize++] = temp[i];
            }
        }

//        return arrayMerge;
        return Arrays.copyOf(arrayMerge, arrayMergeSize); // remove the 0s behind
    }
}
