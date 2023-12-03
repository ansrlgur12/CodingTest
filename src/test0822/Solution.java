package test0822;

import java.util.Scanner;

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
    public int[][] arrayTest(int[][]arr1, int[][]arr2) {
        int rows = arr1.length;
        int cols = arr1[0].length;

        int[][] answer = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

    public static void square(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < b; i++){
            for(int j = 0; j < a; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
