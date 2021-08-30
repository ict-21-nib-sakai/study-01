/**
 * 各種図形の面積を表示する
 */
public class FigureClient {
    public static void main(String[] args) {
        Figure[] figures = {
            new Triangle(),
            new Circle()
        };

        printArea(figures);
    }

    /**
     * 複数の図形の面積を表示する
     */
    public static void printArea(Figure[] figures) {
        for (Figure figure : figures) {
            System.out.println(
                figure.getClass()
            );

            System.out.println("図形の面積: " + figure.getArea());
        }
    }
}
