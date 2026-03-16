public class BT5 {
    static class Config {
        public static final int MAX_SCORE = 100;
        public static final int MIN_SCORE = 0;
    }

    public static void main(String[] args) {
        System.out.println("Diem toi da: " + Config.MAX_SCORE);
        System.out.println("Diem toi thieu: " + Config.MIN_SCORE);

        // BT5.Config.MAX_SCORE = 120; // This line will cause a compilation error
        // BT5.Config.MIN_SCORE = -10; // This line will also cause a compilation error
    }
}