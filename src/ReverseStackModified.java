import java.util.Stack;

public class ReverseStackModified {
    static void reverse(Stack<Integer> stack){
        if(stack.size()==1)
            return;
        int temp = stack.pop();
        reverse(stack);
        insert(stack,temp);
    }
    static void insert(Stack<Integer> stack,int element){
        if(stack.size()==0)
            stack.push(element);
        else
        {
            int temp = stack.pop();
            insert(stack,element);
            stack.push(temp);
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
        for(Integer e : stack)
            System.out.print(e+" ");
        reverse(stack);
        System.out.println(" ");
        for(Integer e : stack)
            System.out.print(e+" ");
    }
}
