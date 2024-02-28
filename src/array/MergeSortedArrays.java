package array;

public class MergeSortedArrays {

    public static void mergeSortedArray(int[] nums1, int m, int[] nums2, int n){
        int index1 = m-1;
        int index2 = n-1;
        int index = m+n-1;

        while (index1 >= 0 && index2 >= 0) {
            if (nums1[index1] > nums2[index2]){
                nums1[index--] = nums1[index1--];
            } else {
                nums1[index--] = nums2[index2--];
            }
        }
        while (index2 >= 0){
            nums1[index--] = nums2[index2--];
        }
    }

    public static int[] merge(int[] a, int[] b){
        int m = a.length;
        int n = b.length;
        int[] mergedArr = new int[m+n];
        int i = 0, j = 0, k = 0;

        while (i<m && j<n){
            if (a[i] <= b[j]){
                mergedArr[k++]= a[i++];
            } else {
                mergedArr[k++] = b[j++];
            }
        }
        if (i<m) {
            mergedArr[k++] = a[i++];
        }
        if (j<n) {
            mergedArr[k++] = b[j++];
        }
        return mergedArr;
    }

    public static void main(String[] args) {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        mergeSortedArray(nums1, m, nums2, n);
        for (int num : nums1){
            System.out.print(num + " ");
        }
    }
}
