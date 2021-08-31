package enshu15;

public class Keyboard implements Usb {
    @Override
    public void sendData() {
        System.out.printf("%s でキーボードを接続します。" + "\n", TYPE);
        System.out.println("キーボードから文字を入力します。");
    }
}
