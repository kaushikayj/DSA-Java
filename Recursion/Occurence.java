package Recursion;

public class Occurence {
    public static int lastocc(int[] arr, int key, int i) {
        // Base case: if we reach the end of the array
        if (i == arr.length) {
            return -1; // Key not found
        }

        // Recursive call
        int isfound = lastocc(arr, key, i + 1);

        // Check current index after recursion
        if (isfound == -1 && arr[i] == key) {
            return i;
        }

        return isfound;
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 6};
        System.out.println(lastocc(arr, 5, 0)); // Should print the index of the last occurrence of 5
        System.out.println(power(2,10)); 
    }
}