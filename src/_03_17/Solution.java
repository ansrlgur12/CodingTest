package _03_17;

public class Solution {
        public boolean test1(String s) {
            boolean answer = true;
            if (s.length() == 4 || s.length() == 6) {
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) < 48 || s.charAt(i) > 57) return answer = false;
                } return answer = true;
            }else return answer = false;
        }
}
