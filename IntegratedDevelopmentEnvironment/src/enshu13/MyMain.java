package enshu13;

public class MyMain {
    public static void main(String[] args) {
        Item[] items = {
            new Item("商品A", 2000),
            new SaleItem("商品B", 1000, 0.8)
        };

        for (Item item : items) {
            item.explain();
        }
    }
}
