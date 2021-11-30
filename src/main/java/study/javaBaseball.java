package study;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class javaBaseball {
    private static int strikeCount;
    private static int ballCount;

    public static void main(String[] args) {

        gameStart();

    }

    private static void gameStart() {
        String randomNumber = RandomNumber.create();

        while (strikeCount != 3) {
            evaluation(InputView.userNumber(), randomNumber);
            ResultView.print();
        }
        restart();
    }

    private static void restart() {
        int number = InputView.restartQuestion();
        if (number == 1) {
            strikeCount = 0;
            gameStart();
        }
        if (number == 2) {
            System.out.println("게임을 종료합니다.");
            System.exit(0);
        }
    }

    private static void evaluation(String userNumber, String randomNumber) {
        strikeCount = 0;
        ballCount = 0;

        for (int i = 0; i < userNumber.length(); i++) {
            isBall(userNumber, randomNumber, i);
            isStrike(userNumber, randomNumber, i);
        }

    }

    private static void isBall(String userNumber, String randomNumber, int i) {
        if (userNumber.charAt(i) != randomNumber.charAt(i)
                && randomNumber.contains(Character.toString(userNumber.charAt(i)))) {
            ballCount++;
        }
    }

    private static void isStrike(String userNumber, String randomNumber, int i) {
        if (userNumber.charAt(i) == randomNumber.charAt(i)) {
            strikeCount++;
        }
    }

    private static class InputView {
        private static String userNumber() {
            System.out.println();
            System.out.print("숫자를 입력해 주세요 : ");
            Scanner sc = new Scanner(System.in);
            return sc.nextLine();
        }

        private static int restartQuestion() {
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            Scanner sc = new Scanner(System.in);
            return sc.nextInt();
        }
    }

    private static class ResultView {

        private static void print() {
            if (ballCount > 0) {
                System.out.print(ballCount + "볼 ");
            }
            if (strikeCount > 0) {
                System.out.println(strikeCount + "스트라이크 ");
            }
            if (ballCount == 0 && strikeCount == 0) {
                System.out.println("낫싱");
            }
            if (strikeCount == 3) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            }
        }
    }

    private static class RandomNumber {
        private static final int MIN = 1;
        private static final int MAX = 9;

        private static String create() {
            Set<Integer> numberSet = new HashSet<>();

            while (numberSet.size() < 3) {
                int randomNumber = (int) (Math.random() * MAX) + MIN;
                numberSet.add(randomNumber);
            }

            StringBuilder stringBuilder = new StringBuilder();
            // numberSet.forEach(num -> stringBuilder.append(num));
            numberSet.forEach(stringBuilder::append);

            return stringBuilder.toString();
        }
    }
}
