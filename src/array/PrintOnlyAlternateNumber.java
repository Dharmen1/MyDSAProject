package array;

public class PrintOnlyAlternateNumber {

    public static void main(String[] args) {

        // 2 4 8 11
        int[] array = {2, 3, 4, 6, 8, 9, 11};
        printOnlyAlternateNumber(array);
    }

    public static void printOnlyAlternateNumber(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            i++;
        }
    }
}
