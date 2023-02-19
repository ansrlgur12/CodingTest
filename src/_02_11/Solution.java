package _02_11;

public class Solution {
        public int test1(long num) {
            int answer = 0;
            int cnt = 0;
            while(num != 1) {
                num = (num % 2 == 0) ? num / 2 : (num * 3) + 1;
                cnt++;
                if(cnt > 500) {
                    return answer = -1;
                }
            }
            return answer = cnt;
        }
}
