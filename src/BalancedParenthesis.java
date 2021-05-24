import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BalancedParenthesis {
    static void print(int open, int close, String s, ArrayList<String> list){
        if(open<0||close<0)
            return;
        if(close<open)
        {
            return;
        }
        if(open==0&&close==0)
        {
            list.add(s);
            return;
        }
        String output1 = s +'(';
        String output2 = s +')';
        print(open-1, close, output1,list);
        print(open, close-1, output2,list);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        print(n,n,"",list);
        System.out.println(list);
    }
}
