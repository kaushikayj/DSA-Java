<<<<<<< HEAD
public class palindrome{
public static boolean isPalindrome(String str){
    
    for (int i=0;i<str.length()/2;i++){
        int n=str.length();
        if(str.charAt(i)!=str.charAt(n-i-1)){
        return false;
        }
    }
    return true;
}
public static void main(String args[]){
    String str="racecar";
    System.out.println(isPalindrome(str));

  }
=======
public class palindrome{
public static boolean isPalindrome(String str){
    
    for (int i=0;i<str.length()/2;i++){
        int n=str.length();
        if(str.charAt(i)!=str.charAt(n-i-1)){
        return false;
        }
    }
    return true;
}
public static void main(String args[]){
    String str="racecar";
    System.out.println(isPalindrome(str));

  }
>>>>>>> eff2fbea89c0e39d1d60c3e91f7ba7140fb29df3
}