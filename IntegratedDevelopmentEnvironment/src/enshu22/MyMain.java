package enshu22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 演習22 コレクションフレームワークの利用 (リスト) その2
 * <p>
 * 実行用のクラス
 */
public class MyMain {
    public static void main(String[] args) {
        /** 商品の入力回数 */
        final int input_times = 3;

        System.out.println("商品名と単回を" + input_times + "回入力してください。");

        /** キー入力を受け付けるクラスインスタンス */
        Scanner scanner = new Scanner(System.in);

        /** キーボードから入力された商品名と単価を保持しておくリスト */
        List<Item> list = new ArrayList<>();

        // キーボードから入力を所定の回数受け付ける
        for (int i = 0; i < input_times; i++) {
            System.out.printf("%dつ目の商品名: ", i + 1);
            /** キーボードから入力された商品名 */
            String itemName = scanner.nextLine();

            System.out.printf("%dつめの単価: ", i + 1);
            /** キーボードから入力された商品の単価 */
            int itemPrice = Integer.parseInt(
                scanner.nextLine()
            );

            /** オリジナルの商品クラス */
            Item item = new Item();

            // リストに商品の情報を追加する
            item
                .setName(itemName)
                .setPrice(itemPrice);

            list.add(item);
        }

        // リストに追加された商品の情報を表示する
        for (int i = 0; i < input_times; i++) {
            System.out.printf("%dつ目の商品: ", i + 1);
            System.out.println(list.get(i).toString());
        }
    }
}
