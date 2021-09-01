package enshu24;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 演習24 コレクションフレームワークの利用 (マップ) その2
 * 実行用のクラス
 */
public class MyMain {
    public static void main(String[] args) {
        /** 入力を受け付ける商品の数 */
        final int input_times = 3;

        System.out.println("商品名と単価を" + input_times + "回入力してください。");

        /** キー入力を受け付けるインスタンス */
        Scanner scanner = new Scanner(System.in);

        /** キーボードから入力された商品の情報を保持しておくMap */
        Map<String, Item> items = new HashMap<>();

        for (int i = 1; i <= 3; i++) {
            System.out.printf("%dつ目の商品名: ", i);
            String itemName = scanner.nextLine();

            System.out.printf("%dつ目の単価: ", i);
            int itemPrice = Integer.parseInt(
                scanner.nextLine()
            );

            /** オリジナルの Item インスタンス */
            Item item = new Item();
            item
                .setName(itemName)
                .setPrice(itemPrice);

            // Map (連想配列) に追加
            items.put(Integer.toString(i), item);
        }

        System.out.println("マップの表示");

        for (int i = 1; i <= input_times; i++) {
            System.out.println(
                items.get(Integer.toString(i)).toString()
            );
        }
    }
}
