import java.util.ArrayList;
import java.util.Scanner;

public class ReverseShuffleMerge {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = s.substring(0,s.length()/2);
        String s2 = s.substring(s.length()/2);
        String s2Rev = new StringBuilder().append(s2).reverse().toString();
        ArrayList<String> list = new ArrayList<>();
        list.add(s2Rev);
    }
}
