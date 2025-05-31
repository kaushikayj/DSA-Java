package Recursion;

public class FriendsPairing {
    public static int pairing(int n){
        if(n==0||n==1||n==2){
            return n;
        }
        int fnm1=pairing(n-1);
        int fnm2=pairing(n-2);
        int totways=fnm1+(n-1)*fnm2;
        return totways;
    }
    public static void main(String args[]){
        int n = 3; // Example input
        System.out.println(pairing(n)); // Should print the number of ways to pair friends
        
    }
}
