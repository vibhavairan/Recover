import java.util.*;

public class MaxLengthConcatenatedString {
    static int driver(List<String> list){
        return calculate(0,list,"");
    }
    static int calculate(int idx, List<String> list, String curr){
        if(idx==list.size())
            return curr.length();
        else
            if(ifPossible(curr+ list.get(idx)))
            {
                return Math.max(calculate(idx+1,list,curr+list.get(idx)),calculate(idx+1,list,curr));
            }
            else return calculate(idx+1,list,curr);
    }
    static boolean ifPossible(String s){
        boolean result = true;
        HashSet<Character> uniquecharset= new LinkedHashSet<>();
        for(int i=0;i<s.length();i++)
        {
            result = uniquecharset.add(s.charAt(i));
            if (!result)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        for(int x=0;x<n;x++)
            list.add(sc.next());
        System.out.println(driver(list));
    }
}
