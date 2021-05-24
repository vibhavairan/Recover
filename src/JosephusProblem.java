import java.util.ArrayList;
import java.util.Scanner;

public class JosephusProblem {
    static void calculate(ArrayList<Integer> people, int k, int idx, int[] ans){
        if(people.size()==1)
        {
            ans[0] = people.get(0);
            return;
        }
        idx = (idx+k)%people.size();
        people.remove(idx);
        calculate(people,k,idx,ans);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> people = new ArrayList<>();
        for(int x=0;x<n;x++)
        {
            people.add(x+1);
        }
        int ans[] = new int[1];
        calculate(people,k-1,0,ans);
        System.out.println(ans[0]);
    }
}
