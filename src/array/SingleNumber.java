package array;
// [2,2,1] -- o/p = 1
public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {1,2,2,4,1};
        singleNumber(nums);
        singleNumberBruteApproach(nums);
    }

    public static void singleNumber(int[] nums) {
        int ans = nums[0];
        for (int i=1; i<nums.length; i++){
            ans = ans^nums[i];
        }
        System.out.println(ans);
    }

    public static void singleNumberBruteApproach(int[] nums) {

        for (int i =0; i<nums.length; i++) {
            int ans = nums[i];
            int count = 0;
            for (int j = 0; j<nums.length; j++) {
                if (nums[j] == ans){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(ans);
            }
        }
   //     System.out.println(0);
    }
}
