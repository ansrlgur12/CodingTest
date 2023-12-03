package CodingTest1204;
// 최대공약수, 최소공배수
public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(12,8));
        int LCM = (12 * 8) / gcd(12, 8);
        System.out.println(LCM);
    }

    public static int gcd(int a, int b){ // 최대공약수
        if (b==0) return a;
        return gcd(b, a%b);
    }
}
