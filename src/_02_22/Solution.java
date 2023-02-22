package _02_22;

import java.util.Arrays;

public class Solution {
        public int[] test1(int[] arr, int divisor) {

            int cnt = 0;
            int cnt2 = 0;
            int tmp = 0;
            int numberLength = 0;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] % divisor == 0) numberLength++;
            }
            int[] answer = new int[numberLength];
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] % divisor == 0) {
                    answer[cnt2] = arr[i];
                    cnt2++;
                } else cnt++;
            }
            if (cnt == arr.length) {
                return answer = new int[]{-1};
            }

            Arrays.sort(answer);
            return answer;
        }
        public int test2(int[] absolutes, boolean[] signs) {
            int answer = 0;

            for(int i = 0; i < absolutes.length; i++) {
                if(signs[i]==true) answer += absolutes[i];
                else answer -= absolutes[i];
            }

            return answer;
        }
        public int[] test3(int[] arr) {

            int min = arr[0];
            if (arr.length == 1) {
                int[] answer = {-1};
                return answer;
            }
            else {
                int answer[] = new int[arr.length - 1];
                for (int i = 0; i < arr.length; i++) {
                    if(min > arr[i]) min = arr[i];
                }

                return answer;
            }
        }
}


