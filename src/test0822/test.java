package test0822;

import java.util.Arrays;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {
        String[] numbers = {"1", "10", "8"};
        Arrays.sort(numbers, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1 + s2).compareTo(s2 + s1);
            }
        });

        StringBuilder smallestNumber = new StringBuilder();
        for (String num : numbers) {
            smallestNumber.append(num);
        }

        System.out.println("Smallest number: " + smallestNumber.toString());
    }
}
