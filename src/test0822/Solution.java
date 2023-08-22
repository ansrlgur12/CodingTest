package test0822;

public class Solution {

    public long T_express(int price, int money, int count) {
        long answer = -1;
        long finalPrice = 0;

        for(int i = 1; i <= count; i++) {
            finalPrice += price * i;
        }

        if(finalPrice > money) return answer = finalPrice - money;
        else return answer = 0;
    }
}
