import java.util.*;

public class BT3 {
    public static <T> List<T> findCommonPatients(List<T> listA, List<T> listB) {
        List<T> rs = new ArrayList<>();

        for (T item : listA) {
            if (listB.contains(item)) {
                rs.add(item);
            }
        }
        return rs;
    }

    public static void main(String[] args) {
        List<Integer> listA = List.of(101, 102, 105);
        List<Integer> listB = List.of(102, 105, 108);

        System.out.println("Danh sach benh nhan thuong: " + findCommonPatients(listA, listB));

        List<String> listC = List.of("Alice", "Bob", "Charlie");
        List<String> listD = List.of("Bob", "Charlie", "David");

        System.out.println("Danh sach benh nhan thuong: " + findCommonPatients(listC, listD));
    }
}