public class Car {
    /** ナンバープレート */
    String number;

    /** 車の色 */
    String color;

    /** 車の速度 */
    int speed;

    /**
     * 車が走る
     */
    public Car run() {
        System.out.println(speed + "で走行中");
        return this;
    }

    /**
     * スピードを上げる
     */
    public Car speedUp() {
        speed += 10;
        return this;
    }
}
