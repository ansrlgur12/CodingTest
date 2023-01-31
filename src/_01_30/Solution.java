package _01_30;

class Solution {
    public int[] solution1(long n) {

        int arrSize = 0;
        int cnt = 0;

        while (n != 0) {
            arrSize++;
            n /= 10;
        }
        int[] answer = new int[arrSize];
        while (cnt == arrSize) {
            answer[cnt] = (int)n % 10;
            cnt++;
            n /= 10;
        }

        return answer;
    }
}