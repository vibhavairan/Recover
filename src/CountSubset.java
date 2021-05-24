public class CountSubset {
    public static void main(String[] args){
        int[] weight = new int[]{3,3,3,3};
        System.out.println(calculate(weight,6,weight.length));
    }
    static int calculate(int weight[], int sum, int n){
        int dp[][] = new int[n+1][sum+1];
        for(int i=0; i<=n; i++)
            for(int j=0; j<=sum; j++)
            {
                if(i==0)
                    dp[i][j] = 0;
                if(j==0)
                    dp[i][j] = 1;
                if(i!=0&&j!=0)
                {
                    if(weight[i-1]<=j)
                        dp[i][j] = dp[i-1][j-weight[i-1]] + dp[i-1][j];
                    else
                        dp[i][j] = dp[i-1][j];
                }
            }
        return dp[n][sum];
    }
}
