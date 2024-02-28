package array;

import java.util.Arrays;

public class ValidMountainArray {

    public static void main(String[] args) {
        int[] arr = {0,2,3,4,5,2,1,0};
        int num = isvalid(arr);
        System.out.println(num);
    }

    public static int isvalid(int[] nums) {
       int i = 0;
       int j = nums.length-1;

       while (i < j) {
           if (nums[i] == nums[j]){
               i++;
               j--;
           } else if (nums[i] > nums[j]) {
               j--;
           } else {
               i++;
           }
       }
        return i;
    }
}
