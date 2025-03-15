package Arrays;
import java.util.*;
import java.io.*;


public class MaxSubArray {
    public static void maxsubarray(int numbers[]){
        int currSum;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start =i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){
                        currSum+=numbers[k];
                    }
                    if(currSum>maxSum){
                        maxSum=currSum;
                    }

                }
            }
            System.out.println("Max Sum:"+maxSum);
        }

public static void main(String args[]){
    int numbers[]={-1,3,-6,4};
    maxsubarray(numbers);

}
}
