import java.util.ArrayList;

public class Josephus {

    static ArrayList<Integer> calculate(ArrayList<Integer> list, int k, int curr){
        if(list.size()==1)
            return list;
        else
        {
            int index = (curr+k)%list.size();
            list.remove(index);
            return calculate(list,k,index);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int x=1;x<=40;x++)
            a.add(x);
        System.out.println(calculate(a,6,0).get(0));
    }
}