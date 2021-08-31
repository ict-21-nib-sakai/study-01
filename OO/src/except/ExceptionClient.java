package except;

public class ExceptionClient {
    public static void main(String[] args) {
        System.out.println("main メソッド開始");

//        // ゼロ除算は例外が投げられる
//        int num = 10 / 0;

//        int[] data = {1, 2, 3};
//
//        // 配列の範囲外を参照した場合、例外が投げられる
//        for (int i = 0; i < 4; i++) {
//            System.out.println("要素の値:" + data[i]);
//        }

//        // NullPointerException が投げられる
//        int[] data = null;
//        System.out.println("要素の値:" + data[0]);

        // NullPointerException が投げられる
        ExceptTest test = null;
        test.sayHello();

        System.out.println("main メソッド終了");
    }
}
