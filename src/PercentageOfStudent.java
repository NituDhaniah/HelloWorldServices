public class PercentageOfStudent {
    public static void main(String[] args) {
        int score = 50;
        {
            if (score >= 90) {
                System.out.println("grade A");
            } else if (score >= 80 && score < 90) {
                System.out.println("grade B");
            } else if (score >= 60 && score < 80) {
                System.out.println("grade C");
            } else if (score < 60) {
                System.out.println("grade D");
            }

        }
    }

}
