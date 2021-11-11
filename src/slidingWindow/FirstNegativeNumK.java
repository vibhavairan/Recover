package slidingWindow;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class FirstNegativeNumK {
    static ArrayList<Integer> calculate(int[] a, int k){
        int i = 0, j = 0;
        Deque<Integer> deque = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        while (j<a.length){
            if(a[j]<0)
                deque.addLast(a[j]);
            if(j-i+1<k)
                j++;
            else if(j-i+1==k){
                if(deque.isEmpty())
                    list.add(0);
                else
                {
                   list.add(deque.peekFirst());
                   if(deque.peekFirst()==a[i])
                       deque.removeFirst();
                }
                i++;
                j++;
            }
        }
        return list;
    }

    public static void main(String[] args){
        System.out.println( calculate(new int[]{12,-1,-7,8,-15,30 ,16 ,28},3));
    }
}
