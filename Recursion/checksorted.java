<<<<<<< HEAD
package Recursion;

public class checksorted {
    public static boolean issorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return issorted(arr,i+1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(issorted(arr,0));
    }
}

=======
package Recursion;

public class checksorted {
    public static boolean issorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return issorted(arr,i+1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(issorted(arr,0));
    }
}

>>>>>>> eff2fbea89c0e39d1d60c3e91f7ba7140fb29df3
