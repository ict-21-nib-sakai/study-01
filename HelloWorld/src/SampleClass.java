public class SampleClass {
    public static void main(String[] args) {
        sayHelloWorld();
        sayHelloName("Jane Doe");
        sayNameAndAge("Jane Doe", 20);
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
}
