<<<<<<< HEAD
package Bits;
import java.util.*;
public class GetithBit{
    public static int ithBit(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;
        }
            else{
                return 1;
            }
        }
        public static int setithBit(int n,int i){
            int bitmask=1<<i;
            return n | bitmask;
        }
        public static int clearithBit(int n,int i){
            int bitmask=~(1<<i);
            return n & bitmask;
        }
        public static int updateithBit(int n,int i,int newbit){
            if(newbit==0){
                return clearithBit(n,i);
            }
            else{
                return setithBit(n,i);
            }
       }
       public static int clearlastBit(int n,int i){
        int bitmask=(~0)<<i;
        return n & bitmask;
    }
    public static int clearrangeBit(int n,int i,int j){
        int a=(~0)<<j+1;
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n & bitmask;
    }
    public static boolean isPoweroftwo(int n){
        return (n & (n-1))==0;
    }
    public static int countsetbits(int n){
        int count=0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;

        }
        return count;
    }
    public static int fastExpo(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans=ans*a;
            }
                a=a*a;
                n=n>>1;
            }
            return ans;
        }
    

    public static void main(String args[]){
        System.out.println(fastExpo(3,5));

    }
   
=======
package Bits;
import java.util.*;
public class GetithBit{
    public static int ithBit(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;
        }
            else{
                return 1;
            }
        }
        public static int setithBit(int n,int i){
            int bitmask=1<<i;
            return n | bitmask;
        }
        public static int clearithBit(int n,int i){
            int bitmask=~(1<<i);
            return n & bitmask;
        }
        public static int updateithBit(int n,int i,int newbit){
            if(newbit==0){
                return clearithBit(n,i);
            }
            else{
                return setithBit(n,i);
            }
       }
       public static int clearlastBit(int n,int i){
        int bitmask=(~0)<<i;
        return n & bitmask;
    }
    public static int clearrangeBit(int n,int i,int j){
        int a=(~0)<<j+1;
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n & bitmask;
    }
    public static boolean isPoweroftwo(int n){
        return (n & (n-1))==0;
    }
    public static int countsetbits(int n){
        int count=0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;

        }
        return count;
    }
    public static int fastExpo(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans=ans*a;
            }
                a=a*a;
                n=n>>1;
            }
            return ans;
        }
    

    public static void main(String args[]){
        System.out.println(fastExpo(3,5));

    }
   
>>>>>>> eff2fbea89c0e39d1d60c3e91f7ba7140fb29df3
}