package enshu13;

public class Item {
    /** 商品名 */
    private String name;

    /** 単価 */
    private int price;

    /**
     * @param name 商品名
     * @param price 単価
     */
    Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    /**
     * 商品名と単価を所定の形式で出力する
     */
    public void explain() {
        // TODO
    }

    /**
     * @return 商品名
     */
    public String getName() {
        return name;
    }

    /**
     * @return 単価
     */
    public int getPrice() {
        return price;
    }
}
