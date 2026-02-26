import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ss4ep3 {
    public static void ep3() {
        String[] transactions = {
                "BK001-20/01",
                "BK005-21/01",
                "BK099-22/01"
        };

        long startSB = System.nanoTime();

        StringBuilder report = new StringBuilder();
        report.append("--- BÁO CÁO MƯỢN SÁCH ---\n");

        String today = LocalDate.now()
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        report.append("Ngày tạo: ").append(today).append("\n");

        for (String t : transactions) {
            report.append("Giao dịch: ").append(t).append("\n");
        }

        long endSB = System.nanoTime();

        long startStr = System.nanoTime();

        String reportStr = "--- BÁO CÁO MƯỢN SÁCH ---\n";
        reportStr += "Ngày tạo: " + today + "\n";

        for (String t : transactions) {
            reportStr += "Giao dịch: " + t + "\n";
        }

        long endStr = System.nanoTime();

        System.out.println(report.toString());

        System.out.println("Số thời gian thực thi đối với StringBuilder: "
                + (endSB - startSB));
        System.out.println("Số thời gian thực thi đối với String: "
                + (endStr - startStr));
    }
}
