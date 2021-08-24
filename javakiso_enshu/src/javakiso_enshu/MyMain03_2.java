package javakiso_enshu;

public class MyMain03_2 {

    public static void main(String[] args) {
        int kokugo = 88;
        int sugaku = 70;
        int eigo = 76;
        int rika = 65;
        int shakai = 55;

        System.out.println("国語: " + kokugo);
        System.out.println("数学: " + sugaku);
        System.out.println("英語: " + eigo);
        System.out.println("理科: " + rika);
        System.out.println("社会: " + shakai);

        int total = kokugo + sugaku + eigo + rika + shakai;
        System.out.println("合計点: " + total);

        double average = (double) total / 5;
        System.out.println("平均点: " + average);
    }

}
