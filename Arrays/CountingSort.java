package Arrays;
import java.util.*;

public class CountingSort {
    public static void countsort(int arr[]) {
        int largest = Integer.MIN_VALUE;

        // Find the maximum value in the array
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Create and populate the count array
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String args[]) {
        int arr[] = {5, 5, 1, 4, 6, 6, 7};
        countsort(arr);
    }
}
