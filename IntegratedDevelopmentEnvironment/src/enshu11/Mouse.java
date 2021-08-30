package enshu11;

public class Mouse extends AbstractItem {
    /**
     * マウスボタン数
     */
    private int buttonNum;

    /**
     * @param String name 商品名
     * @param int price 単価
     * @param int buttonNum
     */
    public Mouse(String name, int price, int buttonNum) {
        super(name, price);
        this.buttonNum = buttonNum;
    }

    @Override
    public void explain() {
        System.out.printf("%s の価格: %,d\n", getName(), getPrice());
        System.out.printf("%s のマウスボタン数: %d\n", getName(), buttonNum);
    }
}
