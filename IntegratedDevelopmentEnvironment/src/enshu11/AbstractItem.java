package enshu11;

public abstract class AbstractItem {
    /** 商品名 */
    private String name;

    /** 単価 */
    private int price;

    public AbstractItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    /**
     * ○○を購入する (○○は商品名) を出力する。
     * 金額と預かり金額、おつりの値を出力する。
     *
     * @param int deposit 預かり金額
     * @return int おつり
     */
    public int buy(int deposit) {
        System.out.printf("%s を購入する", getName());

        System.out.printf(
            "金額: %,d円  預かり金: %,d円  お釣り: %,d円\n",
            getPrice(),
            deposit,
            deposit - getPrice()
        );

        return deposit - getPrice();
    }

    /**
     * @return String 商品名
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return int 単価
     */
    public int getPrice() {
        return this.price;
    }

    /**
     * 実装クラスで商品情報を出力する
     */
    public abstract void explain();
}
