package array;

import java.util.Arrays;

public class SecondLargestNumberInArray {

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 6, 5};
     //   secondLargestElement(nums);
     //   System.out.println(secondLargest(nums));
      //  largest(nums);
    }

    private static void secondLargestElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }
        System.out.println(nums[n - 2]);
    }

    private static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = 0;

        for (int num : arr){
            if (num > largest){
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static void largest(int[] array){
        int lagest = Integer.MIN_VALUE;
        for (int num : array){
            if (num > lagest){
                lagest = num;
            }
        }
        System.out.print(lagest);
    }
}
