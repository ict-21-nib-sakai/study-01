package enshu15;

public class MyMain {
    public static void main(String[] args) {
        Usb[] devices = {
            new Mouse(),
            new Keyboard()
        };

        for (Usb device : devices) {
            device.sendData();
        }
    }
}
