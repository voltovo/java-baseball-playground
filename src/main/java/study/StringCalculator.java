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

    public int calculatorArrayText(String[] array) {
        int value = stringToInt(array[0]);
        for (int i = 0; i < array.length - 2; i += 2) {
            value = calculator(value, array[i + 1].charAt(0), stringToInt(array[i + 2]));
        }
        return value;
    }

    public int calculator(int first, char operator, int second) {
        if (operator == '+') {
            return add(first, second);
        }
        if (operator == '-') {
            return subtract(first, second);
        }
        if (operator == 'x' || operator == '*') {
            return multiply(first, second);
        }
        if (operator == '/') {
            return divide(first, second);
        }
        throw new RuntimeException("올바른 연산식이 아닙니다.");
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
