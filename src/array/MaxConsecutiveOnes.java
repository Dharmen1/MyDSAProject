package array;

// Given a binary array nums, return the maximum number of consecutive 1's in the array.

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {0,0};
        findMaxConsecutiveOnes(nums);
    }

    private static void findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;

        for (int i = 0; i<nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            max = Math.max(count,max);
        }
    //    return max;
        System.out.println(max);
    }
}
