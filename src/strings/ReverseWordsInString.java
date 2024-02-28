package strings;

public class ReverseWordsInString {

    public static void main(String[] args) {
        String s = "What are you doing";
  //    reverseWordsInString(s);
        System.out.println(reverseWordsInString(s));
    }

    private static String reverseWordsInString(String s) {
        String[] words = s.trim().split("\\s+");
        String reverseWord = "";
        for (int i=words.length-1; i>=0; i--) {
            reverseWord = reverseWord + words[i] + " ";
        }
    //  System.out.println(reverseWord);
        return reverseWord;
    }
}
