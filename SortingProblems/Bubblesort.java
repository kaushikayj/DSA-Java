<<<<<<< HEAD
package SortingProblems;
import java.util.*;
import java.io.*;

public class Bubblesort {
    public static void bubblesort(int arr[]){
       
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }

    }
    public static void main(String[] args){
        int arr[]={5,4,3,6,1};
        bubblesort(arr);
        printarr(arr);
    }
         
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

}
    
=======
package SortingProblems;
import java.util.*;
import java.io.*;

public class Bubblesort {
    public static void bubblesort(int arr[]){
       
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }

    }
    public static void main(String[] args){
        int arr[]={5,4,3,6,1};
        bubblesort(arr);
        printarr(arr);
    }
         
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

}
    
>>>>>>> eff2fbea89c0e39d1d60c3e91f7ba7140fb29df3
 