package _01_29;

class Solution {
    public String solution1(int num) {
        String answer = "";
        if(num%2 == 0) answer = "Even";
        else answer = "Odd";

        return answer;
    }

    public int solution2(int n) {
           int answer = 0;
           int cnt = 0;

           for(int i = 1; i <= n; i++) {
               if (n % i == 0) cnt += i;
           }

           return answer = cnt;
    }

    public int solution3(int n) {
        int answer = 0;
        while(n != 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}
