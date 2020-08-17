import java.util.*;

public class LetterTilePossibilities {
    static int driver(String s){
       HashSet<String> set = new LinkedHashSet<>();
       calculate(s,set,"");
       for(String m : set)
           System.out.println(m);
       return set.size();
    }
    static void calculate(String s, HashSet<String> Set, String current){
        if(s.length()==0)
            return;
        for(int x = 0; x<s.length();x++)
        {
            String thisString = current+s.charAt(x)+"";
            Set.add(thisString);
            calculate(s.substring(0,x)+s.substring(x+1),Set,thisString);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(driver(s));
    }
}
