package sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {5,1,2,8,9,4};
        print(arr);
        System.out.println();
        sorting(arr);
        print(arr);
    }

    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void sorting(int[] arr){
        int n =arr.length;
        for (int i=1; i<n; i++){
            int temp = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = temp;
        }
    }
}
