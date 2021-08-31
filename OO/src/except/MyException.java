package except;

public class MyException extends Exception {
    // メッセージなしコンストラクタ
    public MyException() {
        super();
    }

    // メッセージありコンストラクタ
    public MyException(String message) {
        super(message);
    }
}
