public class KnapsackNew {
    public static void main(String[] args){
         int[] profit = new int[]{60, 100, 120};
         int[] weight = new int[]{10, 20, 30};
        System.out.println(calculate(50,profit,weight,3));

    }

    static int calculate(int W, int[] profit, int[] weight, int n){
        if(n==0||W==0)
            return 0;
        if(weight[n-1]<=W)
            return Math.max(profit[n-1]+calculate(W-weight[n-1],profit,weight,n-1),calculate(W,profit,weight,n-1));
        else
            return calculate(W,profit,weight,n-1);
    }
}
