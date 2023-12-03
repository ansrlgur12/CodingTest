package CodingTest1204;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        char[] a = "acdbe".toCharArray();
        char[] b = "ecabd".toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a,b)){
            System.out.println(true);
        } else System.out.println(false);
    }


}
