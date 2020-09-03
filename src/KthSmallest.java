import java.util.*;

public class KthSmallest {
    static class Pair implements Comparable<Pair>{
        int a;
        int b;
        public Pair(int a, int b){
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(Pair o) {
            return this.a - o.a;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[] {7,10,4,3,20,15};
        int k = 3;
        PriorityQueue<Pair> MaxHeap = new PriorityQueue<>(Collections.reverseOrder());
        MaxHeap.add(new Pair(1,30));
        MaxHeap.add(new Pair(2,20));
        MaxHeap.add(new Pair(3,10));
        System.out.println(MaxHeap.peek().a);
    }
}
