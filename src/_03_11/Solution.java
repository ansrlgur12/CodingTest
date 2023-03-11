package _03_11;

import java.util.Arrays;

public class Solution {
    public int test1(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }


    public String test2(String s) {
        String answer = "";
        char[] a = s.toCharArray();
        Arrays.sort(a);
        for (int i = a.length-1; i>=0; i--) {
            answer += a[i];
        }
        return answer;
    }

    public int test3(int left, int right) {
        int answer = 0;
        int cnt = 0;
        for(int i = left; i <= right; i++) {
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    cnt++;
                }
            }
            if(cnt % 2 == 0) answer += i;
            else answer -= i;
            cnt = 0;
        }
        return answer;
    }
}
