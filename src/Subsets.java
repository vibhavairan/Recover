import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args){
        int[] num = new int[]{1,2,3};
        System.out.println(subsets(num));
    }

    static void calculate(int[] num, List<Integer> output, List<List<Integer>> ans, int x)
    {
        if(x>=num.length)
            ans.add(output);
        else
        {
            List<Integer> output2 = new ArrayList<>(output);
            output2.add(num[x]);
            x++;
            calculate(num,output,ans,x);
            calculate(num,output2,ans,x);
        }
    }
    static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> answer = new ArrayList<>();
        calculate(nums,new ArrayList<>(),answer,0);
        return answer;
    }
}
