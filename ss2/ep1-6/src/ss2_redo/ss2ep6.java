package ss2_redo;

import com.sun.jdi.Value;

import java.util.Scanner;

public class ss2ep6 {
    public static void ep6(){
        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE, max = 0, total = 0;

        for (int i = 2; i < 9; i++){
            int temp;
            if (i == 8){
                System.out.println("Nhap luot muon ngay Chu nhat: ");
            } else {
                System.out.println("Nhap luot muon ngay thu "+i+" :");
            }

            temp = sc.nextInt();

            if (temp == 0) continue;

            if (temp > max){
                max = temp;
            }
            if (temp < min){
                min = temp;
            }

            total += temp;
        }

        System.out.println("Kết quả thống kê----");
        System.out.println("luot muon cao nhat: "+max);
        System.out.println("luot muon thap nhat: "+min);
        System.out.println("tb luot muon/ ngay: "+ (double) (total / 7));
    }
}
