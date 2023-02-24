package 수진봇;

import java.util.Scanner;

public class HohosuuGPT {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("========== hohosuu 님과 연결되었습니다 ==========");
        System.out.println("[1] 안녕 수진아!! [2] 안녕 돼지야!!");
        while (true) {
            System.out.print("당신 : ");
            String str = sc.next();
            switch (str) {
                case "1":
                    case1(); break;
                case "2":
                    case2(); break;
                case "종료":
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
            }
        }
    }

    static void case1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("hohosuu : 안녕 귀요미야 !!");
        System.out.println();
        System.out.println("[1] 귀요미 맞아!! [2] 귀요미 아니야!!!");
        System.out.print("당신 : ");
        String str = sc.next();
        switch (str) {
            case "1" :
                System.out.println();
                System.out.println("hohosuu : 재수없어!!");
                System.out.println("------------------------");
                System.out.println("    수진이가 도망갑니다 ");
                System.out.println("------------------------");
                System.exit(0);
            case "2" :
                System.out.println();
                System.out.println("hohosuu : 맞아 아니야!!!");
                System.out.println("------------------------");
                System.out.println("    수진이가 도망갑니다 ");
                System.out.println("------------------------");
                System.exit(0);
        }
    }

    static void case2() {
        System.out.println("----------------------------------");
        System.out.println("hohosuu : 뭐라구했냐!!!! ");
        System.out.println();
        System.out.println("수진이가 무기를 들고 뛰어옵니다!!");
        System.exit(0);
    }
}
