package except;

public class ExceptionClient2 {
    public static void main(String[] args) {
        try {
            int ans1 = plus(0, 10);
            System.out.println("加算結果１: " + ans1);

            int ans2 = plus(0, 11);
            System.out.println("加算結果２ :" + ans2);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int plus(int num1, int num2) throws MyException {
        if (
            (num1 < 0 || num1 > 10)
            || (num2 < 0 || num2 > 10)
        ) {
            throw new MyException("2つの引数のいずれかが不正です。");
        }

        return num1 + num2;
    }
}
