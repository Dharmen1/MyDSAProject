package array;

import java.util.Arrays;

public class SquareOFASortedArray {

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] result = squaresOfSortedArray(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sqaureSortedArray(int[] nums){
        int n = nums.length-1;
        for (int i = 0; i < n; i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static int[] squaresOfSortedArray(int[] nums){
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        int index = nums.length-1;

        while (left <= right){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare){
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }
            index--;
        }
        return result;
    }
}
