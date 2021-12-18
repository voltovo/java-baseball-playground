package baseball;

import java.util.Collections;
import java.util.List;

public class Validation {

    public static final int LIST_SIZE = 3;
    public static final int MAX_NO = 9;
    public static final int MIN_NO = 1;

    public static boolean validNo(int num) {
        return num >= MIN_NO && num <= MAX_NO;
    }

    public static boolean validOverlap(List<Integer> numberList, int no) {
        if (Collections.frequency(numberList, no) > 1) {
            return false;
        }
        return true;
    }

    public static boolean validListSize(List<Integer> numberList) {
        if (numberList.size() == LIST_SIZE) {
            return true;
        }
        return false;
    }

    public boolean isValidNumberList(List<Integer> numberList) {
        for (int i = 0; i < numberList.size(); i++) {
            if (!validNo(numberList.get(i))) {
                System.out.println("1 ~ 9 만 허용됩니다.");
                return false;
            }
            if (!validOverlap(numberList, numberList.get(i))) {
                System.out.println("중복된 숫자는 허용되지 않습니다.");
                return false;
            }
        }

        if (!validListSize(numberList)) {
            System.out.println("3자리만 가능합니다.");
            return false;
        }

        return true;
    }
}
