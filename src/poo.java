import java.util.Scanner;
import java.util.Stack;

public class poo {

    public static void main(String[] args)
    {
        int arr[] = {5, 6, 8, 8, 5};
        System.out.println(printMinOp(arr));
    }
    static int printMinOp(int arr[])
    {
        int arraySum, smallest, arr_size = arr.length;
        arraySum = 0;
        smallest = arr[0];
        for (int i = 0; i < arr_size ; i ++)
        {
            if (arr[i] < smallest)
                smallest = arr[i];

            arraySum += arr[i];
        }

        int minOperation = arraySum - arr_size * smallest;
        return minOperation;

    }
}
