import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Tekion2 {

    static Set<String> result = new HashSet<>();

    static void calculate(int num, String curr, Set<Integer> visited, ArrayList<Integer> yetToBeVisited, int initLength){
        if(num-curr.length()==initLength)
        {
            System.out.println(curr);
            result.add(curr);
        }
        else
        {
            for(int i = 0;i<yetToBeVisited.size();i++ )
            {
                int e = yetToBeVisited.get(i);
                if(!visited.contains(e))
                {
                    yetToBeVisited.remove(i);
                    visited.add(e);
                    if(e>1&&e<num)
                    {
                        if(!visited.contains(e+1)&&!visited.contains(e-1))
                        {
                            yetToBeVisited.add(e+1);
                            yetToBeVisited.add(e-1);
                            calculate(num, curr+e, visited, yetToBeVisited, initLength);
                            yetToBeVisited.remove(yetToBeVisited.size()-1);
                            yetToBeVisited.remove(yetToBeVisited.size()-1);
                        }
                        else if(!visited.contains(e+1))
                        {
                            yetToBeVisited.add(e+1);
                            calculate(num, curr+e, visited, yetToBeVisited, initLength);
                            yetToBeVisited.remove(yetToBeVisited.size()-1);
                        }
                        else if(!visited.contains(e-1))
                        {
                            yetToBeVisited.add(e-1);
                            calculate(num, curr+e, visited, yetToBeVisited, initLength);
                            yetToBeVisited.remove(yetToBeVisited.size()-1);
                        }
                        else {
                            calculate(num, curr+e, visited, yetToBeVisited, initLength);
                        }
                    }
                    else if(e==1)
                    {
                        if(!visited.contains(2))
                        {
                            yetToBeVisited.add(2);
                            calculate(num, curr+e, visited, yetToBeVisited, initLength);
                            yetToBeVisited.remove(yetToBeVisited.size()-1);
                        }
                        else {
                            calculate(num, curr+e, visited, yetToBeVisited, initLength);
                        }
                    }
                    else if(e==num) {
                        if (!visited.contains(num - 1))
                        {
                            yetToBeVisited.add(num - 1);
                            calculate(num, curr+e, visited, yetToBeVisited, initLength);
                            yetToBeVisited.remove(yetToBeVisited.size()-1);
                        }
                        else
                        {
                            calculate(num, curr+e, visited, yetToBeVisited, initLength);
                        }
                    }
                    visited.remove(e);
                    yetToBeVisited.add(i,e);
                }


            }
        }
    }
    public static void main(String[] args){
        int master[] = new int[]{2, 4, 8, 7, 5, 1};

        int num = 5;


        Set<Integer> virus = new HashSet<Integer>();
        ArrayList<Integer> yetToBeVisited = new ArrayList<>();

        boolean[] toCheck = new boolean[num];


        int n = 2;
        virus.add(1);
        toCheck[1-1] = true;
        virus.add(5);
        toCheck[5-1] = true;
       /* 2451;
        2415;
        2145;
        4521;
        4251;
        4215;*/
        for(Integer e : virus){
            if(e==1)
            {
                if(!toCheck[1])
                {
                    toCheck[1] = true;
                    yetToBeVisited.add(2);
                }
            }
            else if(e==num)
            {
                if(!toCheck[num-2])
                {
                    toCheck[num-2] = true;
                    yetToBeVisited.add(num-1);
                }
            }
            else
            {
                if(!toCheck[e-2])
                {
                    toCheck[e-2] = true;
                    yetToBeVisited.add(e-1);
                }
                if(!toCheck[e])
                {
                    toCheck[e] = true;
                    yetToBeVisited.add(e+1);
                }
            }
        }
        calculate(num,"", virus, yetToBeVisited, virus.size());
        System.out.println(result.size());
    }
}
