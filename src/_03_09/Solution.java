package _03_09;
import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int test1(int[] numbers) {
        int answer = 0;
        HashSet<Integer> s1 = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            s1.add(numbers[i]);
        }
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        s2.removeAll(s1);
        for (Integer i : s2) {
            answer += i.intValue();
        }
        return answer;
    }

    public String test2(int n) {
        String answer = "";
        if (n % 2 == 0) {
            for (int i = n; i > 0; i--) {
                if (i % 2 == 0) answer += "수";
                else answer += "박";
            }
        } else {
            for (int i = n; i > 0; i--) {
                if (i % 2 == 0) answer += "박";
                else answer += "수";
            }
        }
        return answer;
    }

    public String test3(String s) {
        //String answer = "";
        int num = s.length() / 2;
   //     if (s.length() % 2 != 0) { // 홀수면
   //         answer = s.substring(num, num + 1);
   //     } else answer = s.substring(num - 1, num + 1);
   //     return answer;
       String answer = (s.length() % 2 !=0) ? s.substring(num, num + 1) : s.substring(num - 1, num + 1);
       return answer;
    }
}