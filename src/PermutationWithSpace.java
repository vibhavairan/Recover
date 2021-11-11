public class PermutationWithSpace {
    public static void main(String[] args){
        calculate("ABC","");
    }

    static void calculate(String input, String output){
        char ch;
        if(input.equals(""))
        {
            System.out.println(output);

        }
            else {
                ch = input.charAt(0);
                input = input.substring(1);
                if(!output.equals(""))
                {
                    calculate(input,output+ch);
                    calculate(input,output+" "+ch);
                }
                else
                    calculate(input,ch+"");
        }
    }

}
