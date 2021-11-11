import java.util.Scanner;

public class CountRepetitions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);
        System.out.println(calculate(s,ch));
    }

    static int calculate(String s, char ch){
        int count = 0;
       for(int x = 0; x<s.length();x++)
           if(s.charAt(x)==ch)
               count++;
           return count;
    }
 }
