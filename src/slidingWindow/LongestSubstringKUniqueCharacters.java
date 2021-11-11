package slidingWindow;

import java.util.HashMap;

public class LongestSubstringKUniqueCharacters {
    static int calculate(String s, int k){
        int i = 0, j = 0, max = Integer.MIN_VALUE;
        int[] count = new int[26];
        HashMap<Character, Integer> hashMap = new HashMap<>();
        while (j<s.length()){
            hashMap.put(s.charAt(j), hashMap.getOrDefault(s.charAt(j), 0)+1);
            if(hashMap.size()<k)
                j++;
            else if(hashMap.size()==k){
                max = Math.max(max,j-i+1);
                j++;
            }
            else if(hashMap.size()>k){
                while (hashMap.size()>k){
                    hashMap.put(s.charAt(i), hashMap.get(s.charAt(i))-1);
                    if(hashMap.get(s.charAt(i))==0)
                        hashMap.remove(s.charAt(i));
                    i++;
                }
                j++;
            }
        }
        return max;
    }

    public static void main(String[] args){
        System.out.println(calculate("aaaa",1));
    }
}
