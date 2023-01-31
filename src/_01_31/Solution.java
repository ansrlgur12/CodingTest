package _01_31;

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
        public int test2(int n) {
            int answer = 0;
            for(int i = 1; i<=n ; i++) {
                if( n % i == 1) {
                    answer = i;
                    break;
                }

            }return answer;
        }
        public long[] test3(int x, int n) {
            long[] answer = new long[n];
            for (long i = 0; i < n; i++) {
                answer[(int)i] = x*(i+1);
            }
            return answer;
        }
}
