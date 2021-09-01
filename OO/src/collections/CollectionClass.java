package collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionClass {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // 要素の末尾にデータを格納
        list.add("バナナ");
        list.add("イチゴ");

        // インデックス「1」の場所にデータを格納
        list.add(1, "リンゴ");

        System.out.println(list.toString());

        //<editor-fold desc="Integer 型のリストを作る">
        List<Integer> intList = new ArrayList<>();

        // List<Integer> としておくことで、基本データ型を代入できる
        intList.add(12);
        intList.add(new Integer(50));

        System.out.println(intList);
        //</editor-fold>
    }
}
