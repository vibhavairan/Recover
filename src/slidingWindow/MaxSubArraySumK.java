package slidingWindow;

public class MaxSubArraySumK {
    static int calculate(int[] a, int k){
        int i = 0, j = 0, sum = 0, max = Integer.MIN_VALUE;
        while (j<a.length){
            sum += a[j];
            if(j-i+1<k)
                j++;
            else if(j-i+1==k){
                max = Math.max(max,sum);
                sum -= a[i];
                i++;
                j++;
            }
        }
        return max;
    }

    public static void main(String[] args){
        System.out.println(calculate(new int[]{100,200,300,400},2));
    }
}
