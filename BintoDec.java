public class BintoDec{
    public static void binTodec(int binnum){
        int pow =0;
        int mynum =binnum;
        int decNum =0;

        while(binnum>0){
            int lastDigit= binnum%10;
            decNum = decNum + (lastDigit*(int)Math.pow(2,pow));
            pow++;
            binnum=binnum/10;

        }
        System.out.println("Decimal of "+mynum+ "="+decNum);

    }
    public static void main(String args[]){
        binTodec(101);
    }
}