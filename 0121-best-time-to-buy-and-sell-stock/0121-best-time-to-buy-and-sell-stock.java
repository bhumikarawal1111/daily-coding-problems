class Solution {
    public static int maxProfit(int[] price) {
        int cp= Integer.MAX_VALUE;
        int Maxprofit=0;
        for(int i=0; i<price.length; i++){
            if(price[i]<cp){
                cp=price[i];
            }
            else{
                int profit= price[i]-cp;
                Maxprofit=Math.max(Maxprofit, profit);
            }
        }
    return Maxprofit;
    }
       
    public static void main(String args[]){
        int price[]={7,1,5,3,6,4};
        int profit = maxProfit(price);
        System.out.println(profit);
    }
}