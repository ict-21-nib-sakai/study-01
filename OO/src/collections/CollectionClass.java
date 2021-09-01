package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionClass {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // 要素の末尾にデータを格納
        list.add("バナナ");
        list.add("イチゴ");

        // インデックス「1」の場所にデータを格納
        list.add(1, "リンゴ");

//        System.out.println(list.toString());

//        // for ループで参照する書き方
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println("要素の値: " + list.get(i));
//        }

        // 拡張 for (foreach) での書き方
        for (String value : list) {
            System.out.println("要素の値: " + value);
        }

        //<editor-fold desc="Integer 型のリストを作る">
        List<Integer> intList = new ArrayList<>();

        // List<Integer> としておくことで、基本データ型を代入できる
        intList.add(12);
        intList.add(new Integer(50));

        System.out.println(intList);
        //</editor-fold>

        //<editor-fold desc="Map Key:Value の追加">
        // Integer がキー、String が値のMapを作った。
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "バナナ");
//        map.put(2, "リンゴ");
//        map.put(3, "イチゴ");
//
//        // キー「1」のすり替え
//        String oldValue = map.put(1, "マンゴー");
//
//        System.out.println("書き換わる前の値: " + oldValue);
//
//        System.out.println("mapの中身" + map);
        //</editor-fold>

        //<editor-fold desc="Mapからキーをforで取り出す">
        // Integer がキー、String が値のMapを作った。
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "バナナ");
        map.put(2, "リンゴ");
        map.put(3, "イチゴ");

        for (Integer code : map.keySet()) {
            System.out.println("商品番号:" + code);
            System.out.println("商品名: " + map.get(code));
            System.out.println("--------------------------");
        }

        // List の場合は、順番が維持されるが、
        // Map の場合は、順番が維持されない。(偶然同じ順番になることがあるかもしれないが)
        // ここはPHPとは違うようだ。

        //</editor-fold>
    }
}
