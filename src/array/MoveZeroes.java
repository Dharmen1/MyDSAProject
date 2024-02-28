package array;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums){
        int left = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                int temp = nums[left];
                nums[left] = nums[i];
                nums[i] = temp;
                left++;
            }
        }
    }

    public static void moveZeroesToEnd(int[] nums){
        int n = nums.length;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                for (int j = i+1; j < n; j++){
                    if (nums[j] != 0) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }
    }
}
