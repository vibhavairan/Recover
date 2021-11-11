public class Solution {
    static int solution(String s) {
     char CHAR_A = 'A';
        int num_Bs = 0, min_dels = 0;
        for(int c=0;c<s.length(); c++) {
            if (CHAR_A == s.charAt(c)) {
                min_dels = Math.min(num_Bs, min_dels + 1);
            }
            else {
                num_Bs++;
            }
        }
        return min_dels;
    }
        public static void main(String[] args){
            System.out.println(solution("BAAABAB"));
        }
}
