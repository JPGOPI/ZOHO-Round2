public class App {
    public static void main(String[] args) {
        String input = "aBuzC9012";
        alternateSort(input);
        System.out.println(alternateSort(input));
    }
    public static  String  alternateSort(String arr) {
        StringBuilder output = new StringBuilder();
        int[] count =new int[256];
        for (char ch : arr.toCharArray()) {
            if (count[ch] == 0 ) {
                output.append(ch);
                count[ch]++;
            } else {
                char replacement = ch;
                if (Character.isDigit(ch)) {
                    replacement = (char)(ch == '9' ? '0' : ch+1);
                } else if (Character.isLowerCase(ch)) {
                    replacement = (char)(ch == 'z' ? 'a' : ch+1);
                } else if (Character.isUpperCase(ch)) {
                    replacement = (char)(ch == 'Z' ? 'A' : ch+1);
                }
                while (count[replacement] !=0) {
                    replacement = (char)(replacement == '9'? '0' : replacement+1);
                }
                output.append(replacement);
                count[replacement]++;
            }
        }
        return output.toString();
    }
}
