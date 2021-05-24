import java.util.Stack;

public class ReverseStack {
    static void reverse(Stack<Integer> helper, Stack<Integer> stack, int index){
        if(stack.empty())
            return;
        else
        {
            int item = stack.pop();
            reverse(helper,stack, index+1);
            helper.push(item);
            System.out.println(item);
            if(index==0)
            {
                while (!helper.isEmpty())
                {
                    stack.push(helper.pop());
                }
            }
        }
    }
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> helper = new Stack<>();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
     /*  for(Integer e : stack)
            System.out.print(e+" ");*/
        reverse(helper,stack,0);
        System.out.println(" ");
        for(Integer e : stack)
            System.out.print(e+" ");
    }
}
