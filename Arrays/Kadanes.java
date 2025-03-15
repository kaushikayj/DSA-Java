package Arrays;

public class Kadanes {
    public static void MaxSubArray(int numbers[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for (int i=0;i<numbers.length;i++){
            cs=cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("Max Subarray is:"+ms);
    }
    public static void main(String args[]){
        int numbers[]={-2,-3,4,-1,-2,5,-3};
        MaxSubArray(numbers);

    }
    
}
