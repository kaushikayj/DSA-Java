package Arrays;

public class buyandsell {
    public static int buysellstocks(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){
                int profit=prices[i]-buyprice;//today's profit
                maxprofit=Math.max(profit,maxprofit);
            }
            else{
             buyprice=prices[i];
            }
            

        }
        return maxprofit;


    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println(buysellstocks(prices));
    }
    
}
