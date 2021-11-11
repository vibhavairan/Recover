import java.util.HashSet;
import java.util.LinkedHashSet;

public class poo2 {
    static int greatest(int[] arr, int sum, int i){
        int sum1, sum2;
        if(i>=arr.length)
            return sum;
        else
        {
            sum1 = greatest(arr, sum, i+1);
            sum2 = greatest(arr, sum+arr[i], i+2);
        }
        return Integer.max(sum1, sum2);
    }
    public static void main(String[] args){
        System.out.println(greatest(new int[]{1,2,9,4,5,0,4,11,6}, 0, 0));
    }
}
