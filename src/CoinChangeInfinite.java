import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoinChangeInfinite {
    static List<List<Integer>> combinationSum(int[] coins, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        combinations(coins, target, new ArrayList<>(), 0, lists);
        return lists;
    }
    static void combinations(int[] a, int amount, List<Integer> ans, int lastCoinUsed, List<List<Integer>> lists)
    {
        if(amount==0)
        {
            lists.add(new ArrayList<>(ans));
        }
        else
        {
            for(int x= lastCoinUsed;x<a.length;x++)
            {
                if(a[x]<=amount)
                {
                    ans.add(a[x]);
                    combinations(a,amount-a[x], ans, x, lists);
                    ans.remove(Integer.valueOf(a[x]));
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int x=0;x<n;x++)
            a[x]= sc.nextInt();
        int amount = sc.nextInt();
        List<List<Integer>> lists = combinationSum(a,amount);
        for( List<Integer> i : lists)
            System.out.println(i);
    }
}
