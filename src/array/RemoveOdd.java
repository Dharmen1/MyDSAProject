package array;

import static java.lang.System.*;

public class RemoveOdd {

    public static void main(String args[]) {

        int nums[] = {21,23,27,29,99};
        removeOdd(nums);

    }

    public static void removeOdd(int[] nums) {
        int n = nums.length;
        int countOdd = 0;

        for (int i = 0; i<n; i++) {
            if (nums[i] % 2 == 0){
                countOdd++;
            }
        }
        int odd[] = new int[countOdd];
        int idx = 0;
        for (int i = 0; i<n; i++) {
            if (nums[i] % 2 == 0){
                odd[idx] = nums[i];
                idx++;
            }
        }
        System.out.println(countOdd);
        for (int i =0; i<countOdd; i++) {
            System.out.print(odd[i] + " ");
        }

    }

    public static class MajorityElement {

        public static void main(String[] args) {
            int[] nums = {3,3};
            int majorityElement = majorityElement(nums);
            out.println(majorityElement);
        }

        public static int majorityElement(int[] nums){
            int majorityElement = nums.length/2;
            int n = nums.length;

            for (int i = 0; i < n; i++){
                int count = 1;
                for (int j = i+1; j < n; j++){
                    if (nums[i] == nums[j]){
                        count++;
                    }
                }
                if (count > majorityElement){
                    return nums[i];
                }
            }
            return -1;
        }

        // using Boyer-Moore Algorithm
        public static int majrityElement(int[] nums){
            int majorityElement = nums[0];
            int count = 1;

            for (int i = 1; i < nums.length; i++){
                if (nums[i] == majorityElement){
                    count++;
                } else if (count == 0){
                    majorityElement = nums[i];
                    count++;
                } else {
                    count--;
                }
                return majorityElement;
            }
            return -1;
        }
    }
}
