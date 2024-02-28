package array;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] intersection = intersection(nums1, nums2);
        System.out.println(Arrays.toString(intersection));

    }

    public static int[] intersection(int[] nums1, int[] nums2){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i : nums1){
            set1.add(i);
        }

        for (int num : nums2){
            if (set1.contains(num)){
                set2.add(num);
            }
        }

        int size = set2.size();
        int[] ans = new int[size];
        int index = 0;

        for (int i : set2){
            ans[index++] = i;
        }
        return ans;
    }
}
