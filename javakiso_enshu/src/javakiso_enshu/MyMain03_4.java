package javakiso_enshu;

public class MyMain03_4 {
    public static void main(String[] args) {
        int score = 80;

        if (score >= 70) {
            System.out.println(
                String.format("%d 点は合格です", score)
            );
            return;
        }

        System.out.println(
            String.format("%d 点は不合格です", score)
        );
    }
}
