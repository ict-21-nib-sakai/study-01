public class SampleClass {
    public static void main(String[] args) {
        sayHelloWorld();
        sayHelloName("Jane Doe");
        sayNameAndAge("Jane Doe", 20);

        System.out.println(
            getString()
        );

        System.out.println(
            plus(0)
        );

        System.out.println(
            plus(3)
        );
    }

    public static void sayHelloWorld() {
        System.out.println("HelloWorld!");
    }

    /**
     * @param String value 表示する名前
     */
    public static void sayHelloName(String value) {
        System.out.println("こんにちは" + value + "さん");
    }

    /**
     * @param String name 表示する名前
     * @param int age 年齢
     */
    public static void sayNameAndAge(String name, int age) {
        System.out.println("名前:" + name);
        System.out.println("年齢:" + age);
    }

    /**
     * @param void
     * @return String
     */
    public static String getString() {
        return "HelloWorld!";
    }

    /**
     * 引数に10を加算してメッセージを返す
     *
     * @param int num
     * @return String 加算結果のメッセージ
     */
    public static String plus(int num) {
        if (num == 0) {
            return "引数は0以外を指定すること";
        }

        return "引数に10を加算:" + (num + 10);
    }

    /**
     * 2つの整数を加算する
     *
     * @param int num1
     * @param int num2
     * @return int 加算結果
     */
    public static int plus(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * 2つの浮動小数点を加算する
     *
     * @param double num1
     * @param double num2
     * @return double 加算結果
     */
    public static double plus(double num1, double num2) {
        return num1 + num2;
    }
}
