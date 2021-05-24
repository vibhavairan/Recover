import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargest {
    static int findKthSmallest(int[] nums, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k)
                minHeap.poll();
        }
        return minHeap.peek();
    }
    public static void main(String[] args){
        System.out.println(findKthSmallest(new int[]{3, 2, 1, 5, 6, 4},2));
    }
}
