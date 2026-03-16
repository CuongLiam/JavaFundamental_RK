import java.util.*;

public class BT4 {
    public static void main(String[] args) {
        List<String> cases = Arrays.asList("Cum A", "Sot Xuat Huyet", "Cum A", "Covid-19", "Sot Xuat Huyet");

        Map<String, Integer> report = new TreeMap<>();

        for (String disease : cases) {
            report.put(disease, report.getOrDefault(disease, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : report.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}