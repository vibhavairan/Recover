import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromePartitioning {
    static List<List<String>> partition(String s){
        List<List<String>> lists = new ArrayList<>();
        calculate(s,lists, new ArrayList<>(), 0);
        return lists;
    }
    static void calculate(String s, List<List<String>> lists, List<String> list, int vidx){
        if (s.length() == vidx) {
            lists.add(new ArrayList<>(list));
            return;
        }

        for (int i = vidx + 1; i <= s.length(); i++) {
            String part = s.substring(vidx, i);
            if (ifPossible(part))
            {
                list.add(part);
                calculate(s,lists,list,i);
                list.remove(list.size()-1);
            }
        }
    }
    static boolean ifPossible(String s){
        String s1 = new StringBuilder().append(s).reverse().toString();
        return s1.equals(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<List<String>> lists = new ArrayList<>();
        lists = partition(s);
        for(List<String> m : lists)
            System.out.println(m);
    }
}
