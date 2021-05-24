import java.util.ArrayList;
import java.util.Scanner;
public class PermutationCaseChange {
    static void print(String input, String output, ArrayList<String> list){
        if(input.equals(""))
        {
            list.add(output);
            return;
        }
        char ch = input.charAt(0);
        if(ch>='0'&&ch<='9')
        {
            output = output + ch;
            input = input.substring(1);
            print(input,output,list);
            return;
        }
        if(ch>='a'&&ch<='z')
            ch = (char) (ch-32);
        else
            ch = (char) (ch+32);
        String output1 = output + input.charAt(0);
        String output2 = output + ch;
        input = input.substring(1);
        print(input,output1,list);
        print(input,output2,list);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<String> list = new ArrayList<>();
        print(s, "",list);
        System.out.println(list);
    }
}
