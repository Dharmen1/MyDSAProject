package array;

import java.util.Arrays;

public class DutchFlagProblem {

    public static void main(String[] args) {
        int[] arr = {0,2,1,1,2,0,2,2,1,2,1,2,0,2,0,1,0};
    //    sortUsingFunction(arr);
    //    System.out.println(Arrays.toString(arr));
        sortThreeNumbers(arr);
        System.out.println(Arrays.toString(arr));;
    }

    // O(nlogn)
    public static void sortUsingFunction(int[] array){
        Arrays.sort(array);
    }

    // O(n^2)
    public void sortUsingTempVariable(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j < n; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // time complexity O(n)
    public static void sortThreeNumbers(int[] arr) {
        int i = 0;
        int j = 0;
        int k = arr.length-1;

        while (i <= k){
            if (arr[i] == 0){
                swap(arr, i, j);
                i++;
                j++;
            } else if (arr[i] == 1) {
                i++;
            } else if (arr[i] == 2) {
                swap(arr, i, k);
                k--;
            }
        }
    }

}
