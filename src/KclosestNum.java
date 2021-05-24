import java.util.*;

public class KclosestNum {
    public static void main(String[] args) {
        /*int[] arr = { 1,1,1,3,2,4,2 };
        PriorityQueue<Pair> q = new PriorityQueue<Pair>(new Pair());
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }


        for(int kk:map.keySet()){
            q.add(new Pair(kk,map.get(kk)));
        }

        ArrayList<Integer> ans=new ArrayList<>();

        while(!q.isEmpty()){
            Pair obj=q.poll();
            for(int i=0;i<obj.value;i++){
                ans.add(obj.key);
            }
        }
        System.out.println(ans);*/
        int[] arr = {5,6,7,8,9};
        PriorityQueue<Pair> minHeap = new PriorityQueue<Pair>(new PairComparator());
        int k = 7;
        for(int x=0;x<arr.length;x++)
        {
            Pair temp = new Pair(Math.abs(arr[x]-k),arr[x]);
            minHeap.add(temp);
            if(minHeap.size()>3)
                minHeap.poll();
        }
        for(Pair x: minHeap)
        {
            System.out.println(x.value);
        }
    }
}

class PairComparator implements Comparator<Pair>{

    @Override
    public int compare(Pair o1, Pair o2) {
        if (o1.key < o2.key)
            return 1;
        else if (o1.key > o2.key)
            return -1;
        return 0;
    }
}

class Pair  {
    int key;
    int value;

    Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }

}