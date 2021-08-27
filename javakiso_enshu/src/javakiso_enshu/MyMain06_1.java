package javakiso_enshu;

public class MyMain06_1 {
    public 
    static void main(String[] args) {
        Name name = new Name();

        // セッター / ゲッター を使う
        name.setName("John Doe");

        System.out.println(
            name.getName()
        );
    }
}
