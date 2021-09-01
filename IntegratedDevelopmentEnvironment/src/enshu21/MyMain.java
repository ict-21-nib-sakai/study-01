package enshu21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 演習21 コレクションフレームワークの利用 (リスト) その1
 */
public class MyMain {
    public static void main(String[] args) {
        /** 入力回数 */
        final int input_times = 3;

        System.out.println("商品名を" + input_times + "回入力してください。");

        /** キーボードから入力した値を取得するScannerインスタンス */
        Scanner scanner = new Scanner(System.in);

        /** キーボードから入力された値を保持しておくリスト */
        List<String> list = new ArrayList<>();

        // キーボードから入力を所定の回受け付ける
        for (int i = 0; i < input_times; i++) {
            System.out.printf("%dつ目の商品名: ", i + 1);
            String input = scanner.nextLine();
            list.add(input);
        }

        // 入力された商品名を表示する
        for (int i = 0; i < input_times; i++) {
            System.out.printf(
                "%dつ目の商品名: %s" + "\n",
                i + 1,
                list.get(i)
            );
        }
    }
}
