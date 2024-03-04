package stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        int[] nums1 = {2,4};
        int[] nums2 = {1,2,3,4};
        int[] result = nextGreaterElement(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }
 // using brute force solution, time complexity O(n^2)
    public static int[] nextGreaterBruteForce(int[] nums1, int[] nums2){
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++){
            int nextGreater = -1;
            boolean found = false;

            for (int j = 0; j < nums2.length; j++){
                if (nums2[j] == nums1[i]){
                    found = true;
                }

                if (found && nums2[j] > nums1[i]){
                    nextGreater = nums2[j];
                    break;
                }
            }
            result[i] = nextGreater;
        }
        return result;
    }

    // Optimized solution, time complexity O(n)
    public static int[] nextGreaterElement(int[] nums1, int[] nums2){
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = nums2.length-1; i >=0 ;i--) {
            int num = nums2[i];

            while (!stack.isEmpty() && stack.peek() <= num){
                stack.pop();
            }

            nextGreaterMap.put(num, stack.isEmpty() ? -1 : stack.peek());
            stack.push(num);
        }
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++){
            result[i] = nextGreaterMap.get(nums1[i]);
        }
        return result;
    }
}
