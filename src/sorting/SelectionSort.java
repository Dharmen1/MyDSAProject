package sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5,1,2,9,10};
        SelectionSort sort = new SelectionSort();
        sort.printArr(arr);
        sort.selectionSort(arr);
        sort.printArr(arr);
    }

    public void printArr(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            int min = i;
            for (int j = i+1; j < n; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
