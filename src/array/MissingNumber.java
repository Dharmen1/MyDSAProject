package array;

public class MissingNumber {

    public static int findMissingNumber(int[] arr){
        int n=arr.length;
        int a = 0;
        int b = 0;

        /*For xor of all the elements in array */
        for (int i = 0; i <n; i++)
            a = a ^ arr[i];

        /* For xor of all the elements from 1 to n+1 */
        for (int i = 0; i < n + 1; i++)
            b = b ^ i;

        return (a ^ b);
    }

    public static void main(String[] args) {
        int[] a = {3,0,1};
        System.out.println(findMissingNumber(a));
    }
}
