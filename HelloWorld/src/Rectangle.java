/**
 * 四角形
 */
public class Rectangle {
    /** 底辺の長さ */
    private int base;

    /** 高さ */
    private int height;

    /**
     * コンストラクタ
     *
     * @param int base 底辺の長さ
     * @param int height 高さ
     */
    Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    int getBase() {
        return base;
    }

    int getHeight() {
        return height;
    }
}