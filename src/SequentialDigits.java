import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequentialDigits {
    static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        calculate(0,high,0,low);
        return list;
    }
    static void calculate(int current, int high, int vidx, int low){
        if(current>low&&current<high)
        {
            System.out.println(current);
        }
        if(current>high||vidx>9)
        {
            return;
        }
        else
        {
            for(int x=1+vidx;x<=9;x++)
            {
                calculate(current*10+x,high,x,low);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        System.out.println(sequentialDigits(low,high));
    }
}
