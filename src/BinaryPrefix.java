import java.util.ArrayList;
import java.util.Scanner;
public class BinaryPrefix {
    static void print(int n, int one, int zero, String s, ArrayList<String> list){
        if(n<0)
            return;
        if(one>=zero&&!s.equals("")&&n==0)
        {
            list.add(s);
        }
        if(s.equals("")){
            print(n-1, one+1, zero,"1",list);
            return;
        }
        String output1 = s +'0';
        String output2 = s +'1';
        print(n-1, one, zero+1,output1,list);
        print(n-1, one+1, zero,output2,list);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        print(n,0,0,"",list);
        System.out.println(list);
    }
}
