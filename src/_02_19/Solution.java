package _02_19;

public class Solution {
    public long test1(long n) {
            long answer = 0;
            for(long i = 0; i*i <= n; i++) {
                if (n == i * i) {
                    answer = (i+1)*(i+1);
                    break;
                }
                else answer = -1;
            }
            return answer;
        }
}