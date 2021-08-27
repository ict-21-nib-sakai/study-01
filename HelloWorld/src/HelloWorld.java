
public class HelloWorld {
    public static void main(String [] args) {
        System.out.println("Hello World");
        System.out.println("name: 山田 太郎");
        System.out.println("鳥取県");
        System.out.println("Tottori");

//        int[] nums = {10, 20, 30};
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

//        int[] nums = {10, 20, 30};
//        for (int value: nums) {
//            System.out.println(value);
//        }

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf(
                    "%s x %s = %2s%n",
                    i,
                    j,
                    i * j
                );
            }
        }
    }
}
