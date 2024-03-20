import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        alternateSort(input, input.length);
    }
    public static void alternateSort(int[] arr, int n) {
        for (int pos = 0 ; pos < n; pos = pos+2) {
            int temp = arr[n-1];
            for (int i = n-1; i > pos; i--) {
                arr[i] = arr[i-1];
            }
            arr[pos] = temp;
        }
       for (int  array : arr) {
        System.out.print(array+" ");
       }
    }
}
