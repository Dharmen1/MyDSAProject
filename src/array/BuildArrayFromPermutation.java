package array;

import java.util.Arrays;
// o/p -- 0,1,2,4,5,3
public class BuildArrayFromPermutation {

    public static void main(String[] args) {
        int[] n = {0,2,1,5,3,4};
        BuildArrayFromPermutation b = new BuildArrayFromPermutation();
        b.buildArray1(n);
        System.out.println(Arrays.toString(n));
        System.out.println(n[n.length-2]);
    }

    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            ans[k++] = nums[nums[i]];
        }
        return ans;
    }

    public int[] buildArray1(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] + (nums[nums[i]] % n) *n;
        }
        for (int i = 0; i < n; i++){
            nums[i] = nums[i] / n;
        }
        return nums;
    }
}
