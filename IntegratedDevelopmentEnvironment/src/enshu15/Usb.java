package enshu15;

public interface Usb {
    /**
     * USB の規格
     */
    public static final String TYPE = "USB3.0";

    public abstract void sendData();
}
