import java.util.*;

public class RestoreIP {
    static List<String> restoreIpAddresses(String S) {
        List<String> list = new ArrayList<>();
        calculate(S,"",0,list,0);
        return list;
    }
    static void calculate(String s, String curr, int vidx, List<String> fin, int count) {
        String part = "";
        if(count>4)
            return;
        if (s.length() == vidx)
        {
            if(count==4)
            fin.add(curr);
            return;
        }
        else {
            for (int i = vidx; i < s.length(); i++) {
                part = part + s.charAt(i)+"";
                if(part.length()>3)
                    return;
                int n = Integer.parseInt(part);
                if(n<0||n>255)
                    return;
                if (part.charAt(0)=='0'&&part.length()>1)
                    return;
                if(curr.equals(""))
                    calculate(s,curr+part,i+1,fin,count+1);
                else
                    calculate(s,curr+"."+part,i+1,fin,count+1);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<String> list;
        list = restoreIpAddresses(s);
        System.out.println(list);
    }
}
