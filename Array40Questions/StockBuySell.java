public class StockBuySell {
   public static int bestTimeToBuySell(int sellingPrice[]){
    int buyPrice=Integer.MAX_VALUE;
    int maxProfit=0;
    for(int i=0;i<sellingPrice.length;i++){
        //profit
        if(buyPrice<sellingPrice[i]){
            int profit=sellingPrice[i]-buyPrice;
            maxProfit=Math.max(maxProfit,profit);
        }
        else{
            buyPrice=sellingPrice[i];
        }
    }
    
    return maxProfit;

   }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int maxProfit = bestTimeToBuySell(arr);
        System.out.println("Max profit is: " + maxProfit);
    
        }
    
}
