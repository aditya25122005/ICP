package Home_Assignment_7;

import java.util.Arrays;

public class Unique_paths {
    public static void main(String[] args) {
        int m=3;
        int n=7;
        int[][] dp= new int[m][n];
        for(int [] a:dp) Arrays.fill(a, -1);
        System.out.println(Count(0, 0, m-1, n-1,dp));

    }
    public static int Count(int cr, int cc, int er, int ec,int [][]dp){
        if(cr==er && cc==ec){
            return 1;
        }
        if(cr<0 || cr>er || cc<0 || cc>ec){
            return 0;
        }
        if(dp[cr][cc]!=-1) return dp[cr][cc];
        int ans=0;
        ans+=Count(cr+1,cc,er,ec,dp);
        ans+=Count(cr, cc+1, er, ec,dp);

        return dp[cr][cc]=ans;
    }
}
