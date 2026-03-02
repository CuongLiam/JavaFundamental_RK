package ss6ep6;

public class ep6 {
    public static void ep6Main(){
        User user = new User("U001", "Nguyen Van B", "     ", "123456");

        user.displayInfo();

        user.setEmail("A2z1B@example.com");
        user.setPassword("12345");

        user.displayInfo();
    }
}
