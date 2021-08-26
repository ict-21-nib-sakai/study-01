package javakiso_enshu;

/**
 * 商品
 */
public class Item {
    /** 商品名 */
    private String itemName;

    /** 単価 */
    private int price;

    /**
     * 商品名と単価を指定するコンストラクタ
     *
     * @param String itemName 商品名
     * @param int price 単価
     */
    Item(String itemName, int price) {
        this.itemName = itemName;
        this.price = price;
    }

    /**
     * 商品名は任意の名称で、単価はメソッド内で既定値を設定するコンストラクタ
     *
     * @param String itemName 商品名
     */
    Item(String itemName) {
        this(itemName, 1000);
    }

    /**
     * 商品名と単価を表示する
     */
    void explain() {
        System.out.println(
            String.format("%sの価格 %,d円", this.itemName, this.price)
        );
    }
}