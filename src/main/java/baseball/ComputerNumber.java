package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ComputerNumber {

    private static Integer makeRandomNumber() {
        int num = (int)(Math.random()*9) + 1;
        return num;
    }

    public static List<Integer> createRandom() {

        List<Integer> randomNumbers = new ArrayList<Integer>();
        
        while (randomNumbers.size() < 3) {
            int randomNumber = makeRandomNumber();
            
            randomNumbers.add(randomNumber);
            
            randomNumbers = randomNumbers.stream()
                    .distinct()
                            .collect(Collectors.toList());
        }

        System.out.println(randomNumbers);
        return randomNumbers;
        
    }
    
}
