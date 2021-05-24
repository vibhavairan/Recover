import java.util.Stack;

public class ReverseStackNew {
    static Stack<Integer> reverse(Stack<Integer> stack){
        if(stack.size()==1)
            return stack;
        else
        {
            int x = stack.pop();
            stack = reverse(stack);
            stack = insert(stack,x);
            return stack;
        }
    }
    static Stack<Integer> insert(Stack<Integer> stack, int k){
        if(stack.size()==0)
        {
            stack.push(k);
            return stack;
        }
        else
        {
            int x = stack.pop();
            stack = insert(stack, k);
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
        for(Integer e: stack)
            System.out.print(e+" ");

        stack = reverse(stack);
        System.out.println("");
        for(Integer e: stack)
            System.out.print(e+" ");
    }
}
