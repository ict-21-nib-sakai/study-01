/**
 * 三角形
 */
public class Triangle extends Figure {
    /** 高さ */
    private double height = 50;

    /** 底辺 */
    private double base = 2;

    @Override
    public double getArea() {
        return (base * height) / 2;
    }
}
