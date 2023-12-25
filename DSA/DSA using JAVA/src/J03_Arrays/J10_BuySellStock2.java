package J03_Arrays;

public class J10_BuySellStock2 {
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        int[] dayProfits = new int [prices.length-1];
        int profit=0;
        for(int i=0;i<prices.length-1;i++){
            dayProfits[i]= prices[i+1]-prices[i];
        }

        for (int dayProfit : dayProfits) {
            if(dayProfit>0){
                profit+=dayProfit;
            }
        }
        System.out.println(profit);
    }
}
