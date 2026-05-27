import java.util.*;

public class Array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int n = arr.length;
        int result[] = new int[n];
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * arr[i - 1];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * right;
            right = right * arr[i];
        }
        System.out.println("Product Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}