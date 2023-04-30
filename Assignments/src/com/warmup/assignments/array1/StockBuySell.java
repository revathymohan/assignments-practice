package com.warmup.assignments.array1;

public class StockBuySell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []prices= {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));


	}
	 public static int maxProfit(int[] prices) {
	        int minPrice = prices[0];
	        int maxProfit =0;
	        for(int i=1;i<prices.length;i++){
	          if(prices[i]<minPrice){
	            minPrice = prices[i];
	          }else if(prices[i]-minPrice > maxProfit)
	            maxProfit = prices[i]- minPrice;

	        }
	        return maxProfit;
	        
	    }

}
