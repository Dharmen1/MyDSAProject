package array;

public class ExtractNumber {

    public static void main(String[] args) {
        String str = "mahesh123";
        String extractNum = extractNum(str);
        System.out.println(extractNum);
    }

    public static String extractNum(String input){
        StringBuilder sb = new StringBuilder();
        boolean foundDigit = false;

        for (int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);

            if (Character.isDigit(ch)){
                sb.append(ch);
                foundDigit = true;
            } else if (foundDigit){
                break;
            }
        }
        return sb.toString();
    }
}
