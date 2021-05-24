public class SubsetSumNew {

    public static void main(String args[])
    {
        int weight[] = new int[]{3, 34, 4, 12, 5, 2};
        System.out.println(calculate(weight,9,weight.length));
    }

    static boolean calculate(int weight[], int sum, int n)
    {
        boolean dp[][] = new boolean[n+1][sum+1];
        for(int i=0; i<=n; i++)
            for(int j=0;j<=sum;j++)
            {
                if(i==0)
                    dp[i][j] = false;
                if(j==0)
                    dp[i][j] = true;
                if(i!=0&&j!=0)
                {
                    if(j>=weight[i-1])
                        dp[i][j] = dp[i-1][j-weight[i-1]] || dp[i-1][j];
                    else
                        dp[i][j] = dp[i-1][j];
                }
            }
        return dp[n][sum];
    }
}
