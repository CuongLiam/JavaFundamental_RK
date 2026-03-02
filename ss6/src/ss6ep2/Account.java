package ss6ep2;

public class Account {
    String userName;
    String password;
    String email;

    public Account(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

    public void displayInfo() {
        System.out.println("User Name: " + userName);
        System.out.println("Password: " + password);
        System.out.println("Email: " + email);
    }
}
