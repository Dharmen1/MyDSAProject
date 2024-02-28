package array;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] twoSumHashMap(int[] nums, int target){
        int n = nums.length;
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i< n; i++){
            if (!map.containsKey(target - nums[i])){
                map.put(nums[i], i);
            } else {
                result[1] = i;
                result[0] = map.get(target-nums[i]);
                return result;
            }
        }
        return result;
    }

    public static int[] twoSum(int[] nums, int target){
        int n = nums.length;
        int[] result = new int[2];
        for (int i = 0; i < n; i++){
            for(int j = i+1; i < n; j++){
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result [1] = j;
                    return result;
                }
            }
        }
        return null;
    }
}
