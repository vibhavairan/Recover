import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdditiveNumber {
    static boolean isAdditiveNumber(String num) {
        List<Long> list = new ArrayList<>();
        calculate(num,new ArrayList<>(),0, false,list);
        return list.size() > 2;
    }
    static void calculate(String s, List<Long> list, int vidx, boolean flag, List<Long> fin) {
        long part=0;
        if(fin.size()>0)
            return;
        if (s.length() == vidx)
        {
            if(flag)
                fin.addAll(list);
        }
        else {
            for (int i = vidx; i < s.length(); i++) {
                part = part*10 + (s.charAt(i)-'0');
                System.out.println(part);
                if(part<0)
                    return;
                if(s.charAt(vidx)=='0'&& part>0)
                    return;
                if (ifPossible(part, list)) {
                    flag = list.size() >= 2;
                    list.add(part);
                    calculate(s, list, i+1,flag,fin);
                    list.remove(list.size() - 1);
                }
            }
        }
    }
    static boolean ifPossible(Long s, List<Long> list){
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
        System.out.println(isAdditiveNumber(s));
    }
}
