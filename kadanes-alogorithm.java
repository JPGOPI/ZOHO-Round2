import java.util.Scanner;

public class App {
    public static int removeDuplicatesAndReplace( int[] input)  {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int i =0; i<input.length; i++) {
            int temp = input[i] + sum;
            if (temp < input[i]) {
                sum = input[i];
            } else {
                sum = temp;
            }
            if (sum > ans ) {
                ans = sum;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Test cases
        int[] testCases = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Input: " + testCases);
        System.out.println("Output: " + removeDuplicatesAndReplace(testCases));
    }
}
