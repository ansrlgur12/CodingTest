package 아크로퓨쳐코딩테스트;

public class Run {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {3, 30, 5, 34, 9, 1};
        String result1 = sol.solution1(numbers);
        String result3 = sol.solution3("가나다abc123가나다abc123가나다abc123가나다abc123가나다abc123가나다abc123가나다abc123가나다abc123", 20).toString();

        System.out.println("1번 문제 : " + result1);
        sol.solution2_1();
        sol.solution2_2();
        System.out.println("3번 문제 : " + result3);

    }
}
