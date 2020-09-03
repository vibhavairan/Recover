import java.util.Arrays;
import java.util.Scanner;

public class EfficientVineet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float a[] = new float[n];
        for(int x=0;x<n;x++)
            a[x] = sc.nextFloat();
        Arrays.sort(a);
        float sack = 0;
        int count = 0;
        for(int x=0;x<n;x++)
        {
            if(sack+a[x]<=3)
               sack = sack+a[x];
            else
            {
                count++;
                sack = a[x];
            }
        }
        System.out.println(count+1);
    }
}
