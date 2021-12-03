package baseball;

import java.util.List;

public class Validation {

    private static final int MAX_NO = 9;
    private static final int MIN_NO = 1;

    public static boolean validNo(int num) {
        return num >= MIN_NO && num <= MAX_NO;
    }

    public static boolean validOverlap(List<Integer> numberList, int no) {
        if (numberList.contains(no)) {
            return true;
        }
        return false;
    }
}
