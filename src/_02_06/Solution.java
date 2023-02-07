package _02_06;

import java.util.ArrayList;
import java.util.List;

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

        public long test2(long n) {
            long answer = 0;
            String ansStr = "";
            long aa = n;
            int cnt = 0;
            while (aa != 0) {
                aa = aa / 10;
                cnt++;
            }
            long arr[] = new long[cnt];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = n % 10;
                n /= 10;
            }
            long tmp;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j < arr.length; j++) {
                    if (arr[i] < arr[j]) {
                        tmp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = tmp;
                    }
                }
            }
            for (long e : arr) {
               ansStr += e;
            }
            return answer = Long.parseLong(ansStr);
        }
}
