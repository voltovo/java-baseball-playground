package baseball;

import java.util.List;

public class BaseballPlay {
    public static void main(String[] args) {
        startGame();
    }
    
    private static void startGame() {

        List<Integer> computerNumbers = new ComputerNumber().createRandom();
        PlayResult result = new PlayResult();
        Balls com = new Balls(computerNumbers);
        while (!result.isEndGame()) {
            List<Integer> inputNumbers = new PlayInput().inputUserNumber();

            if (new Validation().isValidNumberList(inputNumbers)) {
                result = com.play(inputNumbers);
                result.printReport();
            }
        }

        reStartGame();

    }

    private static void reStartGame() {
        int askNo = new PlayInput().askRestart();
        if (askNo == 1) {
            startGame();
        }
        if (askNo == 2) {
            System.out.println("게임을 종료합니다.");
            System.exit(0);
        }
    }
}
