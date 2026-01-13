package ICP_Phase_4.Week_1;

public class Best_Time_To_Buy_And_Sell_Stock {
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        // int [][] dp= new int[prices.length][2];
        // for(int []A:dp){
        //     Arrays.fill(A,-1);
        // }
        int n= prices.length;
        int maxProfit=0;
        int minCost=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(prices[i]<minCost){
                minCost=prices[i];
            }
            else{
                maxProfit=Math.max(maxProfit,prices[i]-minCost);
            }
        }
        return maxProfit;
        // return maxProfit(prices,0,0,0,dp);
    }
    public static int maxProfit(int [] arr, int idx, int prev, int count,int[][] dp){
        if(idx==arr.length){
            return 0;
        }
        if(count==1){
            return 0;
        }
        if(dp[idx][prev]!=-1) return dp[idx][prev];
        int A=0;
        int B=0;
        int C=0;
        int D=0;
        if(prev==0){
            A= -arr[idx]+ maxProfit(arr,idx+1,1,count,dp);
            B= maxProfit(arr,idx+1,0,count,dp);
        }
        if(prev==1){
            C= arr[idx]+ maxProfit(arr,idx+1,0,count+1,dp);
            D= maxProfit(arr,idx+1,prev,count,dp);
        }
        return dp[idx][prev] = Math.max(Math.max(A,B),Math.max(C,D));
    }
}
