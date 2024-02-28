package array;

public class RemoveDuplicatesInASortedArray {

    public static void main(String[] args) {
        int[] nums = {2,2,3,3,3};
        int a = removeDuplicates2(nums);
        System.out.println(a);
    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int index = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[index - 1]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    public static int removeDuplicates2(int[] nums){
        int index = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index-2]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
