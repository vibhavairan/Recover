public class Subset {
    static void printsubset(String in, String out){
        if(in.length()==0)
        {
            System.out.println("{"+out+"}");}
        else
        {
            String out1 = out+in.charAt(0);
            in = in.substring(1);
            printsubset(in,out);
            printsubset(in,out1);
        }
    }
    public static void main(String args[]){
        printsubset("ab","");
    }
}
