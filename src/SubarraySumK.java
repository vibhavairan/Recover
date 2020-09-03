import java.util.HashMap;
import java.util.Scanner;

public class SubarraySumK {
    static int subarraySum(int[] nums, int k) {
        if(nums.length==0)
            return 0;
        int cum_sum=0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x=0;x<nums.length;x++)
        {
            cum_sum += nums[x];
            if(cum_sum==k)
                count++;
            if(map.containsKey(cum_sum-k))
            {
                count+=map.get(cum_sum-k);
            }
            if(map.containsKey(cum_sum))
                map.put(cum_sum,map.get(cum_sum)+1);
            else
                map.put(cum_sum,1);
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(subarraySum(new int[]{1, 1, 1},2));
    }
}
