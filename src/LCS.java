public class LCS {
    public static void main(String[] args){
        System.out.println(calculate("AGGTAB","GXTXAYB",6,7));
    }

    static int calculate(String s1, String s2, int n1, int n2)
    {
        if(n1==0||n2==0)
            return 0;
        if(s1.charAt(n1-1)==s2.charAt(n2-1))
            return 1 + calculate(s1,s2,n1-1,n2-1);
        else
            return Math.max(calculate(s1,s2,n1-1,n2),calculate(s1,s2,n1,n2-1));
    }
}
