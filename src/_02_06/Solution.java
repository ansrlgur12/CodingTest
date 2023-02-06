package _02_06;

public class Solution {
        public int test1(String s) {
            int answer = 0;
            if(s.charAt(1) == '-') {
                s.split("-");
                int aa = Integer.parseInt(s);
                answer = 0 - aa;
            }
            else {
                answer = Integer.parseInt(s);
            }
            return answer;
        }
}
