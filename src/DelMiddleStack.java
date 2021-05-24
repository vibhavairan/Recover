import java.util.Deque;
import java.util.Stack;
import java.util.LinkedList;

public class DelMiddleStack {
    static Stack<Integer> deleteMid(Stack<Integer> stack, int k){
        if(stack.size()==k)
        {
            stack.pop();
            return stack;
        }
        else
        {
            int x = stack.pop();
            stack = deleteMid(stack , k);
            stack.push(x);
            return stack;
        }
    }
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        stack = deleteMid(stack, stack.size()/2+1);

        for(Integer e: stack)
            System.out.print(e+" ");
    }
}
