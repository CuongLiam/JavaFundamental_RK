package ss6ep2;

public class ep2 {
    public static void ep2Main(){
        Account account = new Account("Doan Nhat Cuong", "123", "cuongdn2006@gmail.com");
        System.out.println("Thong tin tai khoan ban dau:");
        account.displayInfo();

        account.changePassword("433");
        System.out.println("\nThong tin tai khoan sau khi da doi mat khau:");
        account.displayInfo();
    }
}
