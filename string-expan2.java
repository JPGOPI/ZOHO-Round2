import java.util.Scanner;

public class App {
    public static String removeDuplicatesAndReplace(String input)  {
        StringBuilder output = new StringBuilder();
        int index = 0;
        char letter = ' ';
        for (char ch : input.toCharArray()) {
            int count = 0;
            if (!(ch >= '0' && ch <= '9')) {
                letter = ch;
                index++;
            } else {
                StringBuilder countStr = new StringBuilder();
                while (index < input.length() && Character.isDigit(input.charAt(index))) {
                    countStr.append(input.charAt(index));
                    index++;
                    count = Integer.parseInt(countStr.toString());
                }
                for (int i = 0; i < count; i++) {
                    output.append(letter);
                }
            }
        }
        return output.toString();
    }

    public static void main(String[] args) {
        // Test cases
        String[] testCases = {
            "1a11b10"
        };

        for (String testCase : testCases) {
            System.out.println("Input: " + testCase);
            System.out.println("Output: " + removeDuplicatesAndReplace(testCase));
        }
    }
}
