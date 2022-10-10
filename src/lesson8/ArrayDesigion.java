package lesson8;

public class ArrayDesigion {
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
         for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+ " ,");
        }
        return nums;

    }
}

