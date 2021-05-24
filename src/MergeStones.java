import java.util.PriorityQueue;

public class MergeStones {
    public static int mergeStones(int[] stones, int K) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int x = 0; x<stones.length; x++)
            minHeap.add(stones[x]);
        int cost = 0;
        int rope  = 0;
        while (minHeap.size()>K){
            for(int x=0;x<K;x++)
                rope = rope + minHeap.poll();
            minHeap.add(rope);
            cost = cost + rope;
            rope = 0;
            System.out.println(cost);
        }
        if(minHeap.size()==K)
        {
            for( Integer i : minHeap)
                cost = cost + i;
            return cost;
        }
        else
            return -1;
    }
    public static void main(String[] args){
        System.out.println(mergeStones(new int[]{3,2,4,1},3));
    }
}
