import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lateDays, borrowedBooks; // n, m
        double lateFees, lateFees2 = 0;

        System.out.println("Số ngày trễ: ");
        lateDays = sc.nextInt();
        System.out.println("Số lượng sách mượn: ");
        borrowedBooks = sc.nextInt();

        lateFees = (lateDays * borrowedBooks * 5000);
        if (lateDays > 7 && borrowedBooks >=3){
            lateFees2 += lateFees + lateFees * 0.2;
        } else{
            lateFees2 += lateFees;
        }

        displayResult(lateFees, lateFees2);
    }

    static void displayResult(double lateFees, double lateFees2){
        System.out.println("Tiền phạt gốc: "+lateFees);
        System.out.println("tiền phạt sau điều chỉnh: "+lateFees2);
        System.out.println("Yêu cầu khoá thẻ: "+((lateFees2 > 50000) ? "true" : "false"));
    }
}