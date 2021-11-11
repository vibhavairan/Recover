import java.util.Stack;

public class NearestGreaterToRight {
    public static void main(String[] args){
        int [] ans = calculate(new int[]{4,5,2,25});

        for(int it: ans)
        System.out.print(it+" ");
    }

    static int[] calculate(int[] num)
    {
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[num.length];

        for(int x=num.length-1;x>=0;x--)
        {
            while (stack.size()!=0&&stack.peek()<num[x])
            {
             stack.pop();
            }

            if(stack.size()==0)
                ans[x] = -1;
            else
                ans[x] = stack.peek();

            stack.push(num[x]);
        }

        return ans;
    }
}
