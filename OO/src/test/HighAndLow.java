package test;

public class HighAndLow {
    private int value;

    public HighAndLow(int value) {
        this.value = value;
    }

    public String check(int v) {
        if (v == this.value) {
            return "draw";
        } else if (v > this.value) { // 不具合を修正
            return "high";
        } else {
            return "low";
        }
    }

}
