/**
 * 円形
 */
public class Circle extends Figure {
    /** 半径 */
    private double radius = 5;

    private static final double PI = Math.PI;

    @Override
    public double getArea() {
        return radius * radius * PI;
    }

}
