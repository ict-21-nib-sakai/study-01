/**
 * Drawing アプリケーションによる図形の「円」
 */
public class Circle {
    /** 円周率 */
    private static double pi;

    /** 半径 */
    private int radius;

    /**
     * 半径を代入する
     *
     * @param int radius 半径
     */
    void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * 円周率を代入する
     *
     * @param double pi 円周率
     */
    static void setPi(double pi) {
        Circle.pi = pi;
    }

    /**
     * @return double 円周率
     */
    static double getPi() {
        return pi;
    }

    /**
     * 半径と面積を表示する
     */
    void show() {
        System.out.println("半径:" + radius);
        System.out.println("面積:" + radius * radius * pi);
    }
}