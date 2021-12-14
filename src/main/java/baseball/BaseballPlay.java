package baseball;

import java.util.Arrays;
import java.util.List;

public class BaseballPlay {
    public static void main(String[] args) {
        startGame();
    }
    
    private static void startGame() {

        List<Integer> computerNumbers = new ComputerNumber().createRandom();
        PlayResult result = new PlayResult();
        //while (result.isEndGame()) {
            List<Integer> inputNumbers = new PlayInput().inputUserNumber();
            System.out.println(inputNumbers);
            
        //}
        System.out.println(computerNumbers);
    }
}
