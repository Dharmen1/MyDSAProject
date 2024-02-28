package strings;

public class reverseEachWordCharacterInAString {

    public static void main(String[] args) {
        String s = "what are you doing";
         reverseEachWordCharacter(s);
    }

    private static void reverseEachWordCharacter(String s) {
        String[] words = s.trim().split("\\s+");
        String reverse = "";
        for (int i = 0; i < words.length; i++){
            String word1 = words[i];
            String reverseCharacter = "";
            for (int j = word1.length()-1; j>=0; j--){
                reverseCharacter = reverseCharacter + word1.charAt(j);
            }
            reverse = reverse + reverseCharacter + " ";
        }
        System.out.println(reverse);
    }
}
