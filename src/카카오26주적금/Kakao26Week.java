package 카카오26주적금;

import java.util.Scanner;

public class Kakao26Week {
    public static void main(String[] args) {
        System.out.print("시작 금액을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int seedMoney = sc.nextInt();
        int FinalMoney = 0;
        int RealFinalMoney = 0;
        for (int i = 0; i < 26; i++) {
            FinalMoney += seedMoney;
            RealFinalMoney += FinalMoney;
            System.out.println((i+1) + "주차 이체 금액 : " + FinalMoney + "... 계좌 금액 : " + RealFinalMoney + "원");
        }
        System.out.println("--------- 26주 적금 종료!! ---------");
        System.out.println("이자 7.00% 적용 : " + (RealFinalMoney*1.07) + "원");
    }
}
