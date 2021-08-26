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

    /**
     * 店舗名と売上を表示
     */
    void print() {
        System.out.println(
            String.format("%sの売上: %d円", this.storeName, this.sales)
        );
    }
}
