package Recursion;

public class Duplicates {
    public static void duplicates(String str,int i,StringBuilder newstr,boolean map[]){
        if(i==str.length()){

            System.out.println(newstr);
            return;
        }
        char currchar=str.charAt(i);
        if(map[currchar-'a']==true){
            duplicates(str,i+1,newstr,map);
        } else {
            map[currchar-'a']=true;
            duplicates(str,i+1,newstr.append(currchar),map);
        }
    }
    public static void main(String args[]){
        String str="appnnacollege";
        duplicates(str,0,new StringBuilder(""),new boolean[26]);
    }
}
