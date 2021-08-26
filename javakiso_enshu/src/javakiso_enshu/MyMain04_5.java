package javakiso_enshu;

public class MyMain04_5 {
    public static void main(String[] args) {
        /** マウス */
        Item mouse = new Item("マウス");
        mouse.explain();

        /** キーボード */
        Item keyboard = new Item("キーボード", 5000);
        keyboard.explain();
    }
}
