package enshu13;

public class SaleItem extends Item {
    /**
     * 割引率
     */
    private double discountRate;

    /**
     * @param name         商品名
     * @param price        価格
     * @param discountRate 割引率
     */
    SaleItem(String name, int price, double discountRate) {
        super(name, price);
        this.discountRate = discountRate;
    }

    /**
     * 割引ありの商品名と価格および割引率を出力する
     */
    public void explain() {
        System.out.printf(
            "【割引ありの商品】%s の価格: %,d円 (割引率: %.1f)" + "\n",
            this.getName(),
            (int) (this.getPrice() * this.discountRate),
            this.discountRate
        );
    }
}
