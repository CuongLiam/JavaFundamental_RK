import java.util.Scanner;

public class ep1 {
    public static void ss2ep1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tuoi cua ban: ");
        int age = sc.nextInt();
        System.out.println("Nhap so sach da muon: ");
        int borrowedBooks = sc.nextInt();

        if (age >= 18  && borrowedBooks < 3) {
            System.out.println("Ket qua: Ban DU DIEU KIEN muon sach quy hiem!");
        } else {
            if (age < 18) {
                System.out.println("""
                                   Ket qua: Ban KHONG DU DIEU KIEN muon sach quy hiem!
                                   Ly do: Ban phai du 18 tuoi tro len!""");
            }
            if (borrowedBooks >= 3) {
                System.out.println("""
                                   Ket qua: Ban KHONG DU DIEU KIEN muon sach quy hiem!
                                   Ly do: Ban da muon toi da 3 cuon sach!""");
            }
        }

        sc.close();
    }



}
