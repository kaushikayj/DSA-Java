package Recursion;
public class xtothepowern {
    public static int optimizedpower(int a,int n){
        if(n==0){
            return 1;
        }
        int halfpower= optimizedpower(a,n/2)*optimizedpower(a,n/2);
        if(n%2!=0){
            halfpower=a*halfpower;
        }
        return halfpower;
    }
    public static void main(String args[]){
        int a = 2, n = 10;
        System.out.println(optimizedpower(a, n)); // Should print 1024
        // Test with other values
        System.out.println(optimizedpower(3, 5)); // Should print 243
        System.out.println(optimizedpower(5, 0)); // Should print 1
        System.out.println(optimizedpower(7, 2)); // Should print 49
    }
}
