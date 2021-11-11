package slidingWindow;

import java.util.HashMap;

public class LongestSubstringWithWithoutRepeating {
    static int calculate(String s){
        int i = 0, j = 0, max = Integer.MIN_VALUE;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        while (j<s.length()){
            hashMap.put(s.charAt(j), hashMap.getOrDefault(s.charAt(j), 0)+1);
            if(hashMap.size()==j-i+1){
                max = Math.max(max,j-i+1);
                j++;
            }
            else if(hashMap.size()<j-i+1){
                while (hashMap.size()<j-i+1){
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
        System.out.println(calculate("pwwkew"));
    }
}
