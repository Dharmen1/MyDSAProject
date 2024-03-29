package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Here, two repeated elemnts are allowed
public class IntersectionOfTwoArrays2 {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2};
        int[] intersection = intersect(nums1, nums2);
        System.out.println(Arrays.toString(intersection));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]){
                i++;
            } else {
                j++;
            }
        }

        int[] result = new int[list.size()];
        int k = 0;
        for (int num : list){
            result[k++] = num;
        }
        return result;
    }

}
