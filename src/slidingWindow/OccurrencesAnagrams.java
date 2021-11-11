package slidingWindow;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class OccurrencesAnagrams {
    static int calculate(String s, String pattern){
        int i = 0, j = 0, sum = 0, k = pattern.length(), z = 0;

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int x=0; x<pattern.length(); x++)
        {
            hashMap.put(pattern.charAt(x), hashMap.getOrDefault(pattern.charAt(x), 0)+1);
        }
        int count = hashMap.size();
        while (j<s.length()){
            if(hashMap.containsKey(s.charAt(j)))
            {
                hashMap.put(s.charAt(j), hashMap.get(s.charAt(j))- 1);
                if(hashMap.get(s.charAt(j))==0)
                    count--;
            }
            if(j-i+1<k)
                j++;
            else if(j-i+1==k){
                if(count==0)
                    z++;
                if(hashMap.containsKey(s.charAt(i))){
                    if(hashMap.get(s.charAt(i))==0)
                        count++;
                    hashMap.put(s.charAt(i), hashMap.get(s.charAt(i))+1);
                }
                i++;
                j++;
            }
        }
        return z;
    }

    public static void main(String[] args){
        System.out.println( calculate("aabaabaa","aaba"));
    }
}
