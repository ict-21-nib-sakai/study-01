public class Television implements Switchable, Volume {

    @Override
    public void switchOn() {
        System.out.println("TVの電源をONにしました");

    }

    @Override
    public void switchOff() {
        System.out.println("TVの電源をOFFにしました");
    }

    @Override
    public void volumeUp() {
        System.out.println("音量を上げました。");
    }

    @Override
    public void volumeDown() {
        System.out.println("音量を下げました");
    }
}
