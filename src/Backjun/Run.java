package Backjun;

import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (true) {
            System.out.println("[1] 회원가입 [2] 회원목록 [3] 종료");
            int selNum = sc.nextInt();
            switch (selNum) {
                case 1:
                    System.out.println("아이디를 입력하세요");
                    boolean idCheck = true;
                    String id = sc.next();
                    for (String e : list) {
                        if (id.equals(e)){
                            System.out.println(id + "??!");
                            System.out.println("중복된 아이디입니다.");
                            idCheck = false;
                        }
                    }
                    if (!idCheck){
                        break;
                    }
                    list.add(id);
                    System.out.println("회원등록이 완료되었습니다.");
                    break;

                case 2 :
                    System.out.println("회원 목록을 조회합니다.");
                    for (String e : list) {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    System.out.println("시스템을 종료합니다.");
                    return;
            }
        }
    }
}
