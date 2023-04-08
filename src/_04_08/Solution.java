package _04_08;

import java.util.Arrays;

public class Solution {
    public String test1(String s) {
        String answer = "";
        String[] str = s.split(" ");
        int num = 32;
        int chr;
        char[] a;

        for (int i = 0; i < str.length; i++){
            for (int j = 0; j < str[i].length(); j++) {
                if (j == 0 || j % 2 == 0) {
                    chr = str[i].charAt(j) - 32;
                    answer += Character.toString(chr);
                }
                else{
                    answer += str[i].charAt(j);
                }
            }
            answer += " ";
        }
        return answer.trim();
    }
}