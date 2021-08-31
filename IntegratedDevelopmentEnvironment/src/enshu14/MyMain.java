package enshu14;

public class MyMain {
    public static void main(String[] args) {
        AbstractItem[] items = {
            new Mouse("マウスA", 1000, 5),
            new Keyboard("キーボードB", 4000, "日本語")
        };

        int deposit = 10000;

        for (AbstractItem item : items) {
            item.explain();
            deposit = item.buy(deposit);
        }
    }
}
