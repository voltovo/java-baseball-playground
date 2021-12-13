package baseball;

public enum JudgmentStatus {

    NOTHING, BALL, STRIKE;
    

    public boolean isNotNothing(){
        return this !=
        NOTHING;
    }

    public boolean isStrike() {
        return this == STRIKE;
    }

    public boolean isBall() {
        return this == BALL;
    }


}
