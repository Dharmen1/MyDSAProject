package sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = {};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length-1);
    }

    private static void quickSort(int[] arr, int start, int end){

        if (start >= end)
            return;

        int boundary = partition(arr, start, end);

        quickSort(arr, start, boundary-1);

        quickSort(arr, boundary+1, end);
    }

    private static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int boundary = start - 1;

        for (int i = start; i <= end; i++) {
            if (arr[i] <= pivot){
                boundary++;
                int temp = arr[i];
                arr[i] = arr[boundary];
                arr[boundary] = temp;
            }
        }
        return boundary;
    }
}
