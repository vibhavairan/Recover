import java.util.Scanner;

public class Temp {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
        int K = sc.nextInt();
        int y=0;
        int cc=0;
        int a[] = new int[N];
        for(int x=0;x<N;x++)
            a[x]=sc.nextInt();
        for(int x=0;x<N-1;x++)
        {
            System.out.println(x);
            int diff = Integer.MAX_VALUE;
            int idx = -1;
            for(y=x+1;y<=x+K&&y<N;y++)
            {
                System.out.println(x+" "+y);
                int abs = Math.abs(a[x] - a[y]);
                if(diff> abs){
                    diff = abs;
                    idx = y;
                }
            }
            cc = cc + diff;
            x = idx;
        }
        System.out.println(cc);
    }
}
