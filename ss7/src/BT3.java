public class BT3 {
    static class ScoreUlti {
        public static void isPass(double score) {
            if (score >= 5.0) {
                System.out.println("Ket qua: Pass");
            } else {
                System.out.println("Ket qua: Fail");
            }
        }

        public static double calculateAverage(double score1, double score2, double score3) {
            return (score1 + score2 + score3) / 3;
        }
    }

    public static void main(String[] args) {
        double score1 = 7.5;
        double score2 = 8.0;
        double score3 = 9.0;

        double average = ScoreUlti.calculateAverage(score1, score2, score3);
        System.out.printf("Diem trung binh: %.2f%n", average);

        ScoreUlti.isPass(average);
    }
}