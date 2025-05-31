<<<<<<< HEAD
package Recursion;

public class Fibonacci {
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
       int fnm1=fib(n-1);
       int fnm2=fib(n-2);
       int fn=fnm1+fnm2;
       return fn;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(fib(n));
    }
=======
package Recursion;

public class Fibonacci {
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
       int fnm1=fib(n-1);
       int fnm2=fib(n-2);
       int fn=fnm1+fnm2;
       return fn;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(fib(n));
    }
>>>>>>> eff2fbea89c0e39d1d60c3e91f7ba7140fb29df3
}