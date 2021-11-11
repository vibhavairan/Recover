public class BalancedParenthesisNew {
    public static void main(String[] args){
        calculate(4,4,"");
    }

    static void calculate(int open, int close, String curr){

        if(open<0||close<0||open>close)
            return;
        if(open==0&&close==0)
        {
            System.out.println(curr);
            return;
        }
        calculate(open-1,close,curr+"{");
        calculate(open,close-1,curr+"}");
    }
}
