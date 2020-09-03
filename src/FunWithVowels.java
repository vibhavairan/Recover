import java.util.Scanner;

public class FunWithVowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        char exp = 'a';
        for(int x=0;x<s.length();x++)
        {
            if(s.charAt(x)=='a'||s.charAt(x)=='e'||s.charAt(x)=='i'||s.charAt(x)=='o'||s.charAt(x)=='u')
            {
                if(s.charAt(x)==exp)
                    count++;
                else if(s.charAt(x)=='e'&&exp=='a')
                {
                    count++;
                    exp = 'e';
                }
                else if(s.charAt(x)=='i'&&exp=='e')
                {
                    count++;
                    exp = 'i';
                }
                else if(s.charAt(x)=='o'&&exp=='i')
                {
                    count++;
                    exp = 'o';
                }
                else if(s.charAt(x)=='u'&&exp=='o')
                {
                    count++;
                    exp = 'u';
                }
            }
        }
        System.out.println(count);
    }
}
