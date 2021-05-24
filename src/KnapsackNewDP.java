public class KnapsackNewDP {
    public static void main(String[] args){
        int[] profit = new int[]{60, 100, 120};
        int[] weight = new int[]{10, 20, 30};
        System.out.println(calculate(50,profit,weight,3));
    }

    static int calculate(int W, int[] profit, int[] weight, int n){
       int dp[][] = new int[n+1][W+1];

       for(int i=0;i<=n;i++)
           for(int j=0;j<=W;j++)
           {
               if(i==0||j==0)
                   dp[i][j]=0;
               else{
                   if(weight[i-1]<=j)
                       dp[i][j] = Math.max(profit[i-1]+dp[i-1][j-weight[i-1]],dp[i-1][j]);
                   else
                       dp[i][j] = dp[i-1][j];
               }
           }
       return dp[n][W];
    }

}
