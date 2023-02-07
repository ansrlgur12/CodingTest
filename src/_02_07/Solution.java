package _02_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (a < b) {
            for (int i = 0; i < b - a + 1; i++) {
                answer += a + i;
            }
        } else if (a > b) {
            for (int i = 0; i < a - b + 1; i++) {
                answer += b + i;
            }
        } else answer = a;
        return answer;
    }
}

