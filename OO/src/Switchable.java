/**
 * 様々な電化製品に共通するメソッド
 */
public interface Switchable {
    /**
     * 電源ON
     */
    public abstract void switchOn();

    /**
     * 電源OFF
     */
    public abstract void switchOff();
}
