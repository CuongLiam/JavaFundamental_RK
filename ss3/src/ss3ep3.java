public class ss3ep3 {
    public static void findMaxQuantityOfBooks(String[] booksName, int[] quantity) {
        int maxQuantity = quantity[0];

        for (int i = 1; i < quantity.length; i++) {
            if (quantity[i] > maxQuantity) {
                maxQuantity = quantity[i];
            }
        }

        System.out.println("Sach co so luong nhieu nhat (" + maxQuantity + "):");
        for (int i = 0; i < quantity.length; i++) {
            if (quantity[i] == maxQuantity) {
                System.out.println("- " + booksName[i]);
            }
        }
    }

    public static void findMinQuantityOfBooks(String[] booksName, int[] quantity) {
        int minQuantity = quantity[0];

        for (int i = 1; i < quantity.length; i++) {
            if (quantity[i] < minQuantity) {
                minQuantity = quantity[i];
            }
        }

        System.out.println("Sach co so luong it nhat (" + minQuantity + "):");
        for (int i = 0; i < quantity.length; i++) {
            if (quantity[i] == minQuantity) {
                System.out.println("- " + booksName[i]);
            }
        }
    }

    public static void ep3(){
        String[] booksName = { "Java Basic", "Python Intro", "C++ Advanced", "JavaScript Essentials", "Data Structures" };
        int[] quantity = { 50, 75, 50, 100, 75 };

        findMaxQuantityOfBooks(booksName, quantity);
        findMinQuantityOfBooks(booksName, quantity);
    }
}
