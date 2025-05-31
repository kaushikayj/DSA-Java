<<<<<<< HEAD
package SortingProblems;

import java.util.Random;
import java.util.Arrays;  // Import Arrays for printing

public class SelectionSort {
    public static void main(String args[]) {
        int arr[] = new int[10];
        Random random = new Random();

        // Generating random values for the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        // Print original array
        System.out.println("Before sorting: " + Arrays.toString(arr));

        // Sort the array
        selectionSort(arr);

        // Print sorted array
        System.out.println("After sorting: " + Arrays.toString(arr));
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int indexMin = i;

            // Find the index of the smallest element in the remaining array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexMin]) {
                    indexMin = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            if (indexMin != i) { // Swap only if needed
                int temp = arr[i];
                arr[i] = arr[indexMin];
                arr[indexMin] = temp;
            }
        }
    }
}
=======
package SortingProblems;

import java.util.Random;
import java.util.Arrays;  // Import Arrays for printing

public class SelectionSort {
    public static void main(String args[]) {
        int arr[] = new int[10];
        Random random = new Random();

        // Generating random values for the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        // Print original array
        System.out.println("Before sorting: " + Arrays.toString(arr));

        // Sort the array
        selectionSort(arr);

        // Print sorted array
        System.out.println("After sorting: " + Arrays.toString(arr));
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int indexMin = i;

            // Find the index of the smallest element in the remaining array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexMin]) {
                    indexMin = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            if (indexMin != i) { // Swap only if needed
                int temp = arr[i];
                arr[i] = arr[indexMin];
                arr[indexMin] = temp;
            }
        }
    }
}
>>>>>>> eff2fbea89c0e39d1d60c3e91f7ba7140fb29df3
