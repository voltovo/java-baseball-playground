package baseball;

public enum JudgmentStatus {

    NOTHING, BALL, STRIKE;
    

    public boolean isNotNothing(){
        return this !=
        NOTHING;
    }
}
