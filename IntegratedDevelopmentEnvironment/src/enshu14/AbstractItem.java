package enshu14;

public abstract class AbstractItem {
    /**
     * 商品名
     */
    private String name;

    /**
     * 価格
     */
    private int price;

    /**
     * @param name  商品名
     * @param price 単価
     */
    public AbstractItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    /**
     * @param deposit 預かり金額
     * @return お釣り
     */
    public int buy(int deposit) {
        this.explain();
        System.out.println(this.getName() + " を購入する");
        System.out.printf(
            "金額: %,d円  預かり金額: %,d円  お釣り: %,d円" + "\n",
            getPrice(),
            deposit,
            deposit - getPrice()
        );

        return deposit - getPrice();
    }

    /**
     * 商品の情報を出力する抽象メソッド
     */
    abstract void explain();

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
