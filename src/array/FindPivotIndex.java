package array;

public class FindPivotIndex {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int pivotIndex = pivotIndex(nums);
        System.out.println("Pivot index: " + pivotIndex);
    }

    // pivot index is the index from which the sum of left elements is equal to the sum of right elements
    public static int pivotIndex(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int totalSum = 0;
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++){
            totalSum = totalSum + nums[i];
        }

        for (int i = 0; i < nums.length; i++){
            int rightSum = totalSum - leftSum - nums[i];
            if (rightSum == leftSum) {
                return i;
            }
            leftSum = leftSum + nums[i];
        }
        return -1;
    }
}
