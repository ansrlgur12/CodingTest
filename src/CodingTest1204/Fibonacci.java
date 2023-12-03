package CodingTest1204;

public class Fibonacci {

    public static void main(String[] args) {
//        System.out.println(Fibonacci1(3));
        System.out.println("재귀형식 : " + Fibonacci2(8));
    }

    public static int Fibonacci1(int n) {
        int a = 0,  b = 1, c = 0;
        if (n == 0) return 0;
        if (n == 1) return 1;
        for (int i = 2; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static int Fibonacci2(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return Fibonacci2(n - 1) + Fibonacci2(n - 2);
    }
}
