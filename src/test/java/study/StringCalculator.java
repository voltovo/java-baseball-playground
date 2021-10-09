package study;

import java.util.Scanner;

public class StringCalculator {
    public String readText() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        scanner.close();
        return text;
    }

    public boolean isBlank(String text) {
        if (text.isBlank() || text == null) {
            return false;
        }
        return true;
    }

    public int stringToInt(String text) {
        return Integer.parseInt(text);
    }

    public String[] arrayText(String text) {
        return text.split(" ");
    }

    public int calculator(int first, char operator, int second) {
        if (operator == '+') {
            return add(first, second);
        }
    }

    public int add(int a, int b) {
        return a + b;
    };

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        return a / b;
    }

}
