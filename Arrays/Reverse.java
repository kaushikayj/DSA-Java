package Arrays;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Reverse {
    public static void reverse(int numbers[]){
        int start=0,end=numbers.length-1;
        while(start<end){
            int temp=numbers[end];
            numbers[end]=numbers[start];
            numbers[start]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int numbers[]={2,7,8,4,6,9,1};
        reverse(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+ " ");
        

        }
        System.out.println();
        
    }
    
}
