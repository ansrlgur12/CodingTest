package 아크로퓨쳐코딩테스트;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    String path = "c:/Users/user/IdeaProjects/CodingTest/src/아크로퓨쳐코딩테스트/data.json";

    public String solution1(int[] numbers){

        String[] numStr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numStr[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(numStr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1 + s2).compareTo(s2 + s1);
            }
        });

        StringBuilder answer = new StringBuilder();
        for (String num : numStr) {
            answer.append(num);
        }

        return answer.toString();
    }

    public String solution2_1() {

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            StringBuilder jsonContent = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                jsonContent.append(line);
            }

            String jsonString = jsonContent.toString();
            System.out.println(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
}

    public String solution2_2() {

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            StringBuilder jsonContent = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                jsonContent.append(line);
            }

            String jsonString = jsonContent.toString();
            System.out.println(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

    public List<String> solution3(String text, int n) {
// TODO
        List<String> result = new ArrayList<>();
        StringBuilder currentLine = new StringBuilder();
        int currentLength = 0;

        for (char c : text.toCharArray()) {
            int length = (c < 128) ? 1 : 2;

            if (currentLength + length > n) {
                result.add(currentLine.toString());
                currentLine = new StringBuilder();
                currentLength = 0;
            }

            currentLine.append(c);
            currentLength += length;
        }

        if (currentLine.length() > 0) {
            result.add(currentLine.toString());
        }

        return result;
    }
}
