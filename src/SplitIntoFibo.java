import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SplitIntoFibo {
    static List<Integer> splitIntoFibonacci(String S) {
        List<Integer> list = new ArrayList<>();
        calculate(S,new ArrayList<>(),0, false,list);
        return list;
    }
    static void calculate(String s, List<Integer> list, int vidx, boolean flag,List<Integer> fin) {
        int part=0;
        if(fin.size()>0)
            return;
        if (s.length() == vidx)
        {
            if(flag)
                fin.addAll(list);
            return;
        }
        else {
            for (int i = vidx; i < s.length(); i++) {
                part = part*10 + (s.charAt(i)-'0');
                if(part<0)
                    return;
                if(s.charAt(vidx)=='0'&& part>0)
                    continue;
                if (ifPossible(part, list)) {
                    flag = list.size() >= 2;
                    list.add(part);
                    calculate(s, list, i+1,flag,fin);
                    list.remove(list.size() - 1);
                }
            }
        }
    }
    static boolean ifPossible(int s, List<Integer> list){
        int l = list.size();
        if(l<2)
            return true;
        else {
            return (list.get(l-2)+list.get(l-1)==s);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<Integer> list;
        list = splitIntoFibonacci(s);
        System.out.println(list);
    }
}
