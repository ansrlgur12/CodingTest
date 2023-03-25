package _03_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int test1(String[] babbling) {
        int answer = 0;
        List<String[]> list = new ArrayList<>();
        for (int i = 0; i < babbling.length; i++) {
            String[] arr = babbling[i].split("aya|ye|woo|ma");
            list.add(arr);
        }
        for (String[] e : list) {
            if (e.length == 0) answer++;

        }

        return answer;
    }


        public int[] test2(int numer1, int denom1, int numer2, int denom2) {

            int max = 0;
            for (int i = 1; i <= denom1 && i <= denom2; i++) {
                    if (denom1 % i == 0 && denom2 % i == 0) {
                        max = i;
                    }
                }
            int n2 = denom1 * denom2 / max;
            int n1 = numer1 * n2 / denom1 + numer2 * n2 / denom2;
            int[] answer = {n1, n2};

            for (int i = 0; i < answer.length; i++) {
                System.out.println(answer[i]);
            }
            System.out.println("최대공약수 : " + max);
            System.out.println("최소공배수 : " + n2);
            return answer;
        }

}
