package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ComputerNumber {

    private static Integer makeRandomNumber() {
        int num = (int)(Math.random()* Validation.MAX_NO) + Validation.MIN_NO;
        return num;
    }

    public static List<Integer> createRandom() {

        List<Integer> randomNumbers = new ArrayList<Integer>();
        
        while (randomNumbers.size() < Validation.LIST_SIZE) {
            int randomNumber = makeRandomNumber();
            
            randomNumbers.add(randomNumber);
            //Listd에서 중복 제거
            randomNumbers = randomNumbers.stream()
                    .distinct()
                            .collect(Collectors.toList());
        }

        System.out.println(randomNumbers);
        return randomNumbers;
        
    }
    
}
