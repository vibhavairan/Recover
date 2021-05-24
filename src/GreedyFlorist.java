import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class GreedyFlorist {
    static int getMinimumCost(int k, int[] c) {
        if(k==0||c.length==0)
            return 0;
        Arrays.sort(c);
        int count = 1;
        int checker = 0;
        int cost=0;
        for(int x=c.length-1;x>=0;x--)
        {
            cost = cost + count*c[x];
            checker++;
            if(checker==k)
            {
                count++;
                checker=0;
            }
        }
        return cost;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int c[] = new int[n];
        for(int x=0;x<n;x++)
            c[x] = sc.nextInt();
       System.out.println(getMinimumCost(k,c));
    }
}
