package enshu14;

public class Mouse extends AbstractItem {
    /**
     * マウスボタンの数
     */
    private int buttonNum;

    public Mouse(String name, int price, int buttonNum) {
        super(name, price);
        this.buttonNum = buttonNum;
    }

    @Override
    void explain() {
        System.out.printf("%s の価格: %,d円" + "\n", getName(), getPrice());
        System.out.printf("%s のマウスボタン数: %d" + "\n", getName(), this.buttonNum);
    }
}
