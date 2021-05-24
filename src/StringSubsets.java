import java.util.ArrayList;
import java.util.Scanner;

public class StringSubsets {
    static void print(String input, String output, ArrayList<String> list){
        if(input.equals(""))
        {
            list.add(output);
            return;
        }
        String output1 = output;
        String output2 = output + input.charAt(0);
        input = input.substring(1);
        print(input,output1,list);
        print(input,output2,list);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<String> list = new ArrayList<>();
        print(s,"",list);
        System.out.println(list);
    }
}
