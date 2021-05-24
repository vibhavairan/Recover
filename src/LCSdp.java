public class LCSdp {
    public static void main(String[] args){
        System.out.println(calculate("AGGTAB","GXTXAYB",6,7));
    }
    static int calculate(String s1, String s2, int n1, int n2){
        int[][] dp = new int[n1+1][n2+1];
        for(int i=0;i<=n1;i++)
            for(int j=0;j<=n2;j++)
            {
                if(i==0||j==0)
                    dp[i][j] = 0;
                else
                {
                    if(s1.charAt(i-1)==s2.charAt(j-1))
                        dp[i][j] = 1 + dp[i-1][j-1];
                    else
                        dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }

        System.out.println(print(dp,n1,n2,s1,s2));
        return dp[n1][n2];
    }

    static String print(int[][] dp, int n1, int n2, String s1, String s2){
        String curr = "";
        while (n1>0&&n2>0)
        {
            if(s1.charAt(n1-1)==s2.charAt(n2-1))
            {
                curr = s1.charAt(n1-1) + curr;
                n2--;
                n1--;
            }
            else
                if(dp[n1][n2-1]>dp[n1-1][n2])
                    n2--;
                else
                    n1--;
        }
        return curr;
    }
}
