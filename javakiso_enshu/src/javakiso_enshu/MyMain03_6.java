package javakiso_enshu;

public class MyMain03_6 {
    public static void main(String[] args) {
        System.out.println("car メソッドを呼び出します");
        car();
        System.out.println("car メソッドの呼び出しが完了しました");
    }

    /**
     * 演習3.6 引数なし、戻り値なしの確認 (6)
     */
    public static void car() {
        System.out.println(
            "出発します。" + "\n"
            + "前進します" + "\n"
            + "後退します" + "\n"
            + "止まります"
        );
    }
}
