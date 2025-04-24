package StringPrograms;

public class StringCompression {
    public static String compress(String str){
        StringBuilder sb=new StringBuilder();
        String newstr="";
        for(int i=1;i<str.length();i++){
            Integer count=1;
            while(str.charAt(i)== str.charAt(i+1) && i<str.length()-1){
                count++;
                i++;
            }
            newstr+=str.charAt(i);
            if(count>1){
                newstr+=count.toString();
            }

            }
            return newstr;

        }
    public static void main(String args[]){
        String str="aabbcc";
        System.out.println(compress(str));

    }
}
