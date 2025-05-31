package Recursion;

public class BinaryStrings {
    public static void binaryStrings(int n, int lastplace,String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        binaryStrings(n - 1, 0,str + "0");
        if(lastplace==0){
        binaryStrings(n - 1, 1,str + "1");
        }
    }

    public static void main(String[] args) {
        int n = 3; // Example input
        binaryStrings(n,0, ""); // Should print all binary strings of length 3
    }   
}
