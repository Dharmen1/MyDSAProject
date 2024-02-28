package strings;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Hello";
        String reverse = revString(str);
        System.out.println(reverse);
    }

    private static void reverseString(String str){
        char ch;
        String rev = "";

        for (int i = str.length()-1; i >= 0; i--){
            ch = str.charAt(i);
            rev = rev + ch;
        }
        System.out.println(rev);
    }

    private static void revStr(String str) {
        char[] ch = str.toCharArray();

        for (int i = str.length()-1; i >= 0; i--){
            System.out.print(ch[i]);
        }
    }

    private static void reverseStr(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str).reverse().toString();
        System.out.println(sb);
    }

    private static String revString(String str){
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = str.length()-1;

        while (start < end){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }

}
