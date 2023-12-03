package CodingTest1204;

public class Factorial {
    public static void main(String[] args) {
//        System.out.println(Factorial1(5));
        System.out.println("재귀형식 : "+Factorial2(1));
    }

    public static int Factorial1(int n) {
        int answer = 1;
        for (int i = 1; i <= n; i++) {
            answer *= i;
        }
        return answer;
    }

    public static int Factorial2(int n){
        if (n==1) return 1;
        return n * Factorial2(n - 1);
    }
}

