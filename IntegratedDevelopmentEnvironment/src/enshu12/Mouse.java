package enshu12;

public class Mouse implements Usb {
    @Override
    public void sendData() {
        System.out.printf("%s でマウスを接続します。" + "\n", TYPE);
        System.out.println("マウスカーソルを動かします。");
    }
}
