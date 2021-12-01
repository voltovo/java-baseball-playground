package baseball;

public class InputNumber {

    private static final int MAX_NO = 9;
    private static final int MIN_NO = 1;

    public static boolean validNo(int num) {
        return num >= MIN_NO && num <= MAX_NO;
    }

}
