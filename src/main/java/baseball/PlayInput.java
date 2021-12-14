package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayInput {
    
    public List<Integer> inputUserNumber() {
        System.out.print("숫자를 입력해 주세요 : ");
        Scanner sc = new Scanner(System.in);
        List<Integer> userNumbers = mapToUserNumbers(sc.nextLine());
        return userNumbers;
    }

    private List<Integer> mapToUserNumbers(String inputNumber) {
        List<Integer> userNumbers = new ArrayList<>();
            for (int i = 0; i < inputNumber.length(); i++) {
                userNumbers.add(inputNumber.charAt(i)-'0');
            }
        return userNumbers;
    }

}
