package enshu22;

/**
 * 演習22 コレクションフレームワークの利用 (リスト) その2
 * 商品クラス
 */
public class Item {
    /**
     * 商品名
     */
    private String name;

    /**
     * 単価
     */
    private int price;

    public String getName() {
        return name;
    }

    public Item setName(String name) {
        this.name = name;

        return this;
    }

    public int getPrice() {
        return price;
    }

    public Item setPrice(int price) {
        this.price = price;

        return this;
    }

    @Override
    public String toString() {
        return String.format(
            "Item [name=%s, price=%d]",
            this.getName(),
            this.getPrice()
        );
    }
}
