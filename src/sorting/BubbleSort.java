package sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] n = {5,1,6,8,4,3,7,9,10};
        printArray(n);
        sort(n);
        System.out.println();
        printArray(n);
    }

    public static void printArray(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(int[] arr){
        int n = arr.length;
        boolean isSwapped;
        for (int i = 0; i < n; i++){
            isSwapped = false;
            for (int j = 0; j < n-1-i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped)
                break;
        }
    }
}
