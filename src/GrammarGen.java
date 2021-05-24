public class GrammarGen {

    static boolean generate(int n , int k){
        if(n==1&&k==1)
            return false;
        else
        {
            int mid =(int) Math.pow(2,n-1)/2;
            if(k<=mid)
                return generate(n-1,k);
            else
                return !generate(n-1,k-mid);
        }
    }
    public static void main(String[] args){
        System.out.println(generate(4,7));
    }
}
