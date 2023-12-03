package CodingTest1204;

public class Radix {
    public static void main(String[] args) {

        changeRadix(2556, 16);
    }

    public static void changeRadix(int n, int radix) {

        int[] num = new int[100];

        int idx = 0;
        while(n > 0) {
//            System.out.println(n);
//            System.out.println(n % radix);
//            System.out.println("-----------------");
            num[idx] = n % radix;
            n /= radix;
            idx++;
        }
        idx--;

        for(;idx >= 0; idx--) {
            if(num[idx] < 10)
                System.out.printf("%c", num[idx] + 48);
            else
                System.out.printf("%c", num[idx] + 55);
        }
    }
}
