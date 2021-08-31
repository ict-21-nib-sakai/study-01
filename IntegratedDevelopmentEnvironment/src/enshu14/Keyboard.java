package enshu14;

public class Keyboard extends AbstractItem {
    /**
     * キーレイアウト
     */
    private String keyLayout;

    /**
     * @param name      商品名
     * @param price     単価
     * @param keyLayout キーレイアウト
     */
    public Keyboard(String name, int price, String keyLayout) {
        super(name, price);
        this.keyLayout = keyLayout;
    }

    @Override
    void explain() {
        System.out.printf("%s の価格: %,d円" + "\n", getName(), getPrice());
        System.out.printf("%s のキーレイアウト: %s" + "\n", getName(), this.keyLayout);
    }
}
