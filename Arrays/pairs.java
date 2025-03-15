package Arrays;
import java.util.*;
import java.lang.*;
import java.io.*;

public class pairs {
    public static void Pairs(int n[])
    {
        for(int i=0;i<n.length;i++){
            int curr=n[i];
            for(int j=i+1;j<n.length;j++){
                System.out.print("("+curr+","+n[j]+")");
            }
            System.out.println();
        }
      
    }
    public static void main(String[] args) {
        int n[]={2,4,6,8,10};
        Pairs(n);
    }
    
}
