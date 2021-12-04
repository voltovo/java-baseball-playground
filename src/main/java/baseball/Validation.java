package baseball;

import java.util.List;

public class Validation {

    public static final int LIST_SIZE = 3;
    public static final int MAX_NO = 9;
    public static final int MIN_NO = 1;

    public static boolean validNo(int num) {
        return num >= MIN_NO && num <= MAX_NO;
    }

    public static boolean validOverlap(List<Integer> numberList, int no) {
        if (numberList.contains(no)) {
            return true;
        }
        return false;
    }

    public static boolean validListSize(List<Integer> numberList) {
        if (numberList.size() == LIST_SIZE) {
            return true;
        }
        return false;
    }
}
