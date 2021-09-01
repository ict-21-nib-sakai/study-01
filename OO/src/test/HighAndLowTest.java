package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HighAndLowTest {

    @Test
    void test() {
        // fail("まだ実装されていません");
        // 何をテストするか
        // HighAndLow クラスの check メソッドが、渡した引数に対して
        // 期待通りの動作をするかテストする。

        HighAndLow highLow = new HighAndLow(10);

        // check メソッドに 10 を渡したら、結果は "draw" になるはず。
        assertEquals("draw", highLow.check(10));

        // check メソッドに 9 を渡したら、結果は "high" になるはず。
        assertEquals("high", highLow.check(9));
    }

}
