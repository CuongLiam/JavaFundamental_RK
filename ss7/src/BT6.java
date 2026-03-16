import java.util.ArrayList;

public class BT6 {
    static class User {
        private final String id;
        private String userName;
        private String password;

        public User(String id, String userName, String password) {
            this.id = id;
            this.userName = userName;
            this.password = password;
        }

        public String getId() {
            return id;
        }

        public String getUserName() {
            return userName;
        }

        public String getPassword() {
            return password;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void displayInfo() {
            System.out.println("User ID: " + id);
            System.out.println("User Name: " + userName);
        }
    }

    static class UserManager {
        private static final ArrayList<User> users = new ArrayList<>();

        public static void addUser(User user) {
            users.add(user);
        }

        public static User findUserById(String id) {
            for (User user : users) {
                if (user.getId().equals(id)) {
                    return user;
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        User user1 = new User("U001", "alice", "password123");
        User user2 = new User("U002", "bob", "securepass");

        UserManager.addUser(user1);
        UserManager.addUser(user2);

        User foundUser = UserManager.findUserById("U003");

        if (foundUser != null) {
            foundUser.displayInfo();
        } else {
            System.out.println("Khong tim thay User!");
        }
    }
}