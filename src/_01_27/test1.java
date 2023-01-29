package _01_27;
//      문제 설명
//        대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True,
//        다르면 False 를 return 하는 solution 를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True 를 리턴합니다.
//        단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
//        예를 들어 s가 "pPoooyY"면 true 를 return 하고 "Pyy"라면 false 를 return 합니다.



class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                p++;
            }
            if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                y++;
            }
        }
        if (p == y) return true;
        else return false;

    }
}