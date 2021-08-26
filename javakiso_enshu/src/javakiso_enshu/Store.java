package javakiso_enshu;

public class Store {
    /** 店舗名 */
    private String storeName;

    /** 売上 */
    private int sales;

    /**
     * コンストラクタ
     */
    public Store(String storeName, int sales) {
        this.storeName = storeName;
        this.sales = sales;
    }

    public static void main(String[] args) {
        // 東京店のインスタンスを作成して、売上を表示
        Store storeTokyo = new Store("東京店", 500000);
        storeTokyo.print();

        // 渋谷店のインスタンスを作成して、売上を表示
        Store storeShibuya = new Store("渋谷店", 1000000);
        storeShibuya.print();
    }

    /**
     * 店舗名と売上を表示
     */
    void print() {
        System.out.println(
            String.format("%sの売上: %d円", this.storeName, this.sales)
        );
    }
}
