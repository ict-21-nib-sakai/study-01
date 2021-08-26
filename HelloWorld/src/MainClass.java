public class MainClass {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar
            .speedUp()
            .run();

        // 円周率を設定
        Circle.setPi(3.14);

        // 円周率を表示
        System.out.println("円周率:" + Circle.getPi());

        // 円の面積を表示
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.show();
    }
}