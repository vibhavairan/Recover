import java.util.HashSet;
import java.util.Set;

public class Tekion {
    public static void main(String[] args)
    {
        //System.out.println(calculate(12));
        int master[] = new int[]{2, 4, 8, 7, 5, 1};

        int num[] = new int[]{1,2,3,4,5};

        int virus[] = new int[]{3};

        Set<Integer> visited = new HashSet<Integer>();
       /* 2451;
        2415;
        2145;
        4521;
        4251;
        4215;*/
        visited.add(3);
        calculate(num,3, "", visited);
    }

    static void calculate(int num[], int x, String curr,  Set<Integer> visited){
        if(num.length-curr.length()==1)
        {
            System.out.println(curr);
            return;
        }
        else {
            if(x<num.length&&x>0)
            {
                if(!visited.contains(x+1)&&!visited.contains(x-1)){
                    visited.add(x+1);
                    curr = curr+""+(x+1);
                    calculate(num, x+1, curr, visited);
                    visited.add(x-1);
                    curr = curr+""+(x-1);
                    calculate(num, x-1, curr, visited);
                    visited.remove(x+1);
                    visited.remove(x-1);
                }

                else if(!visited.contains(x+1))
                {
                    visited.add(x+1);
                    calculate(num, x+1, curr+""+(x+1), visited);
                    visited.remove(x+1);
                }
                else if(!visited.contains(x-1))
                {
                    visited.add(x-1);
                    calculate(num, x-1, curr+""+(x-1), visited);
                    visited.remove(x-1);
                }
            }
            else if(x==num.length)
            {
                if(!visited.contains(x-1))
                {
                    visited.add(x-1);
                    calculate(num, x-1, curr+""+(x-1), visited);
                    visited.remove(x-1);
                }
            }
            else if(x==1)
            {
                if(!visited.contains(x+1))
                {
                    visited.add(x+1);
                    calculate(num, x+1, curr+""+(x+1), visited);
                    visited.remove(x+1);
                }
            }
        }
    }
    /*static int calculate(int n)
    {
        long x = (long) Math.pow(2, n);
        if(x<10)
            return (int) x;
        else
            return rec(x);
    }
    static int rec(long x)
    {
        long res = 0;
        while (x!=0)
        {
            res = res + x%10;
            x = x/10;
        }
        if(res<10)
            return (int) res;
        else
            return rec(res);
    }*/
}
