import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoinChangeNotInfinite {
    static void calculate(int[] a, int idx, int amount, List<Integer> temp, List<List<Integer>> lists){
        if(amount==0)
        {
            System.out.println(temp);
            lists.add(new ArrayList<>(temp));
            return;
        }
        else
        if(idx==a.length||amount<0)
        {
            return;
        }
        else if(a[idx]<=amount)
        {
            temp.add(a[idx]);
            calculate(a, idx+1,amount-a[idx],temp,lists);
            temp.remove(Integer.valueOf(a[idx]));
            calculate(a, idx+1,amount,temp,lists);
        }
        else
            calculate(a,idx+1,amount,temp,lists);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int x=0;x<n;x++)
            a[x]= sc.nextInt();
        int amount = sc.nextInt();
        List<List<Integer>> lists = new ArrayList<>();
        calculate(a,0,amount,new ArrayList<>(), lists);
    }
}
