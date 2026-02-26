import java.util.Scanner;

public class ss4ep1 {
    public static String normalizeSpace(String str) {
        return str.trim().replaceAll("\\s+", " ");
    }

    public static String capitalizeWords(String str) {
        String[] words = str.split(" ");
        StringBuilder capitalized = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        return capitalized.toString().trim();
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void inputAndPrintString(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi can chuan hoa: ");
        String input = sc.nextLine();
        str = capitalizeWords(normalizeSpace(input));
        System.out.println("Chuoi sau khi chuan hoa: " + str);
        sc.close();
    }

    public static void ep1() {
        String str = "";
        inputAndPrintString(str);
    }
}
