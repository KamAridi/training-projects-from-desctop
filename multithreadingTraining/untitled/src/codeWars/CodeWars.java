package codeWars;

public class CodeWars {
    public static void main(String[] args) {


        String s = "jaslkf Wally";

        int index = s.indexOf(" Wally");
        System.out.println(index);


    }

    public static int solution(int number) {
        int sum = 0;
        if (number < 2) return 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 | i % 5 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static boolean isTriangle(int a, int b, int c) {
        if (((a + b) >= c) | ((a + c) >= b) | ((c + b) >= a ) | (a <= 0) | (b <= 0) | (c <= 0)){
            return false;
        }
        return true;
    }
}

