package ss3_redo;

public class ep3 {
    public static void ep3Main(){
        String[] names = new String[]{"Java basic", "ok", "hi", "helo", "halo"};
        int[] quantities = new int[]{100, 50, 5, 100, 5};

        maxQuantityOfBooks(names, quantities);
        minQuantityOfBooks(names, quantities);

    }

    static void maxQuantityOfBooks(String[] names, int[] quantities){
        int max = quantities[0];

        for (int i = 0; i < quantities.length; i++){
            if (quantities[i] > max){
                max = quantities[i];
            }
        }

        System.out.println("Sach co so luong nhieu nhat (" + max + "):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == max) {
                System.out.println("- " + names[i]);
            }
        }
        System.out.println("---------------");
    }

    static void minQuantityOfBooks(String[] names, int[] quantities){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < quantities.length; i++){
            if (quantities[i] < min){
                min = quantities[i];
            }
        }

        System.out.println("Sach co so luong nhieu nhat (" + min + "):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == min) {
                System.out.println("- " + names[i]);
            }
        }
        System.out.println("---------------");
    }
}
