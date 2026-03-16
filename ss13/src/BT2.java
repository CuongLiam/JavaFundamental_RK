import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BT2 {
    public static List<String> uniqueAndSortedDrug(List<String> drugs) {
        Collection<String> uniqueDrugs = new ArrayList<>();
        for (String drug : drugs) {
            if (!uniqueDrugs.contains(drug)) {
                uniqueDrugs.add(drug);
            }
        }

        List<String> sortedUniqueDrugs = new ArrayList<>(uniqueDrugs);
        Collections.sort(sortedUniqueDrugs);

        return sortedUniqueDrugs;
    }

    public static void main(String[] args) {
        List<String> drugs = List.of("Aspirin", "Paracetamol", "Ibuprofen", "Aspirin", "Paracetamol", "Paradol");
        List<String> result = uniqueAndSortedDrug(drugs);

        System.out.println("Danh sach thuoc ban dau: " + drugs);
        System.out.println("Danh sach thuoc khong trung lap va da sap xep: " + result);
    }
}