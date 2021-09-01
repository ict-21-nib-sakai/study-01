package debug;

/**
 * 統合開発環境 テキスト
 */
public class DebugClient {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;

        System.out.println(num1 + num2);
        System.out.println(num1 * num2);

        try {
            int[] data = {1, 2, 3};

            // わざと配列の範囲外を参照するバグ付きプログラム
            for (int i = 0; i < 4; i++) {
                System.out.println("要素の値: " + data[i]);
            }
        } catch (IndexOutOfBoundsException e) {
            // 例外が起きた場合、スタックトレースを表示する。
            e.printStackTrace();
        }
    }
}
