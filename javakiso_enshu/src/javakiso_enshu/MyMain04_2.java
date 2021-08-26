package javakiso_enshu;

public class MyMain04_2 {
    public static void main(String[] args) {
        // 東京店のインスタンスを作成して、売上を表示
        Store storeTokyo = new Store("東京店", 500000);
        storeTokyo.print();

        // 渋谷店のインスタンスを作成して、売上を表示
        Store storeShibuya = new Store("渋谷店", 1000000);
        storeShibuya.print();
    }
}
