package recursion;

public class FibonacciSeries {

    public int fibonacci(int n){
        if (n <= 1)
            return n;
        int left = fibonacci(n-1);
        int right = fibonacci(n-2);
        return left + right;
    }

    public static void main(String[] args) {
        int n = 5;
        FibonacciSeries fn = new FibonacciSeries();
        for (int i = 0; i < n; i++){
            System.out.print(fn.fibonacci(i) + " ");
        }
    }
}
