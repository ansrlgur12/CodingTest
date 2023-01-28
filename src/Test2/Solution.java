package Test2;

public class Solution {
    public String solution1(String[] seoul) {

        String answer = "";
        for (int x = 0; x < seoul.length; x++) {
            if (seoul[x].equals("Kim")) {
                answer = "김서방은 " + x + "에 있다";
            }
        }
        return answer;
    }

    public String solution2(String phone_number) {
        String answer = "";
        char[] pNum = phone_number.toCharArray();
        int cnt = 0;
        for (int i = 0; i < pNum.length - 4; i++) {
                pNum[i] = '*';
        }
        for (int i = 0; i < pNum.length; i++) {
            answer += pNum[i];
        }
        return answer;
    }

    public double solution3(int[] arr) {
        double answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer /= arr.length;
    }
}


