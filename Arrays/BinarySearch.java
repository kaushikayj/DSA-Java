package Arrays;
import java.util.*;


public class BinarySearch {
    public static int binarysearch(int n[],int key){
        int start=0,end=n.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(n[mid]==key){
                return mid;
            }
        if(n[mid]>key){
            end=mid-1;
        }
        if(n[mid]<key){
            start=mid+1;
        }
        }
    return -1;
    }


    
    public static void main(String args[]){
        int n[]={2,6,8,5,43,5};
        int key=43;
        System.out.println("index:"+binarysearch(n,key));
    }
}
