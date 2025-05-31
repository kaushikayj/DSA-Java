<<<<<<< HEAD
package Recursion;

public class Fact {
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static int calcsum(int n){
        if(n==1){
            return 1;
        }
        return n+calcsum(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(calcsum(n));
    }
}
=======
package Recursion;

public class Fact {
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static int calcsum(int n){
        if(n==1){
            return 1;
        }
        return n+calcsum(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(calcsum(n));
    }
}
>>>>>>> eff2fbea89c0e39d1d60c3e91f7ba7140fb29df3
