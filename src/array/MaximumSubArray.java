package array;

public class MaximumSubArray {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubArray max = new MaximumSubArray();
        max.findMaxSubArray(nums);
    }

    public void findMaxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i=1; i<nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            maxSum = Math.max(currentSum, maxSum);
        }
        System.out.println(maxSum);
    }
}
