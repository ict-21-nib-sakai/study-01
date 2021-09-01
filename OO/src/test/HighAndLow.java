package test;

public class HighAndLow {
    private int value;

    public HighAndLow(int value) {
        this.value = value;
    }

    public String check(int v) {
        if (v == this.value) {
            return "draw";
        } else if (v < this.value) {
            return "high";
        } else {
            return "low";
        }
    }

}
