import java.util.Scanner;

public class ep6 {
    public static void ss2ep6(){
        Scanner sc = new Scanner(System.in);

        int max = -1;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int countOpenDays = 0;

        for(int i = 2; i <= 8; i++) {
            String day = (i == 8) ? "T" + i : "CN";
            System.out.println("Nhap luot muon ngay " + day + ": ");
            int borrowCount = sc.nextInt();

            if(borrowCount == 0) {
                continue;
            }

            if(borrowCount > max) {
                max = borrowCount;
            }

            if(borrowCount < min) {
                min = borrowCount;
            }

            sum += borrowCount;
            countOpenDays++;
        }

        double average = (countOpenDays > 0) ? (double) sum / countOpenDays : 0;

        System.out.println("So ngay mo cua: " + countOpenDays);
        System.out.println("So luot muon lon nhat: " + max);
        System.out.println("So luot muon nho nhat: " + min);
        System.out.println("Trung binh so luot muon: " + average);

        sc.close();
    }
}
