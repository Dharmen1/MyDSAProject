package array;

public class RemoveEvenIntegerInArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,5,40};
        removeEvenIntegers(nums);
    }

    public static void removeEvenIntegers(int[] nums) {
        int n = nums.length;
        int countOdd=0;
        int[] odd = null;

        for (int i=0; i<n; i++) {
            if (nums[i] % 2 != 0)
                countOdd++;
        }
        odd = new int[countOdd];
        int ind = 0;

        for (int i=0; i<n; i++){
            if (nums[i] % 2 != 0) {
                odd[ind] = nums[i];
                ind++;
            }
        }
        System.out.println(countOdd);
        System.out.println(odd);
    }
}
