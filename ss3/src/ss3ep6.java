import java.util.Arrays;

public class ss3ep6 {
    static int[] mergeBooks(int[] a, int[] b) {
        int[] temp = new int[a.length + b.length];
        int k = 0;

        for (int x : a) temp[k++] = x;
        for (int x : b) temp[k++] = x;

        Arrays.sort(temp);

        int[] result = new int[temp.length];
        int size = 0;

        for (int i = 0; i < temp.length; i++) {
            if (i == 0 || temp[i] != temp[i - 1]) {
                result[size++] = temp[i];
            }
        }

        return Arrays.copyOf(result, size);
    }

    public static void ep6() {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 3, 5, 6, 8, 9, 10};

        int[] merged = mergeBooks(a, b);
        System.out.println("Mang sau khi gop va loai bo trung lap:");
        System.out.println(Arrays.toString(merged));
    }
}
