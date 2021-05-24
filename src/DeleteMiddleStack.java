import java.util.Scanner;
import java.util.Stack;

public class DeleteMiddleStack {
    static void delMin(Stack<Integer> stack, int size)
    {
        if(stack.size()==size/2+1) {
            stack.pop();
            return;
        }
        int num = stack.pop();
        delMin(stack,size);
        stack.push(num);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for(int x=0;x<n;x++)
            stack.add(sc.nextInt());
        delMin(stack,stack.size());

        for(int x : stack)
            System.out.print(x+" ");
    }
}
