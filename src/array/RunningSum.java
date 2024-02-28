package array;

import java.util.Arrays;

public class RunningSum {

    public static void main(String[] args) {
        int[] n = {1,2,3,4};
        int[] a = runningSum(n);
        System.out.println(Arrays.toString(n));
    }

    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
