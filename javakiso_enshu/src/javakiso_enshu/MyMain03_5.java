package javakiso_enshu;

public class MyMain03_5 {

    public static void main(String[] args) {
        int[] nums = {10, 20, 30};
        int sum = 0;

        for (int value: nums) {
            sum += value;
        }

        System.out.println("合計 " + sum);
        System.out.println("平均 " + (double)sum / nums.length);
    }

}
