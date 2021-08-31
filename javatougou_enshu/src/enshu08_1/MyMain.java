package enshu08_1;

public class MyMain {
    public static void main(String[] args) {
        int[] arrays = {0, 10, 20};
        int num = 200;
        int index = 0;

        try {
            double answer = num / arrays[index];
            System.out.println("答え:【" + answer + "】");
        } catch(ArithmeticException e) {
            System.out.println("0では除算できません。");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("範囲外のインデックスは指定できません。");
        }
    }
}
