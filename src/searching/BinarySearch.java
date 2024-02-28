package searching;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {5,1,6,10,14,15,9,21};
        int target = 15;
        System.out.println(search(arr, target));
    }

    public static int search(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while (left <= right){
            int mid = (left + right)/2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
