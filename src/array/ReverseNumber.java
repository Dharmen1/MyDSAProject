package array;

public class ReverseNumber {

    public static int reverse(int number){
        int rev  = 0;
        while(number != 0){
            int digit = number % 10;
            rev = rev * 10 + digit;
            number = number / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int number = 10234;
        System.out.println(reverse(number));
    }
}
