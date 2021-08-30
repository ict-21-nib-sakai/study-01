package enshu11;

public class MyMain {
    public static void main(String[] args) {
        Mouse mouse = new Mouse("マウスA", 1000, 2);

        mouse.explain();
        int change = mouse.buy(5000);

        System.out.printf("お釣りを %,d円 受け取った\n", change);
    }
}
