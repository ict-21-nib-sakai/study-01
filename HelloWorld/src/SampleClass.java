public class SampleClass {
    public static void main(String[] args) {
        sayHelloWorld();
        sayHelloName("Jane Doe");
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
}
