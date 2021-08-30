public class Television implements Switchable {

    @Override
    public void switchOn() {
        System.out.println("TVの電源をONにしました");

    }

    @Override
    public void switchOff() {
        System.out.println("TVの電源をOFFにしました");
    }
}
