package array;

import java.util.Arrays;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int a = majorityElementOptimized(nums);
        System.out.println(a);
    }

    public static int majorityElement(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n; i++){
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]){
                    count++;
                }
            }
            if (count > n/2) {
                return nums[i];
            }
        }
        return -1;
    }

    public int majorityEle(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static int majorityElementOptimized(int[] nums){
        int candidate = nums[0];
        int count = 1;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == candidate){
                count++;
            } else {
                count--;
            }

            if (count == 0){
                candidate = nums[i];
                count = 1;
            }
        }

        count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == candidate){
                count++;
            }
        }
        if (count > nums.length/2){
            return candidate;
        }
        return -1;
    }
}
