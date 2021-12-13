package baseball;

public class PlayResult {

    private int strike = 0;
    private int ball = 0;

    public int getStrike() {
        return this.strike;
    }

    public int getBall() {
        return this.ball;
    }

    public void report(JudgmentStatus status) {
        if (status.isStrike()) {
            this.strike++;
        }
        if (status.isBall()) {
            this.ball++;
        }
    }

    public boolean isEndGame() {
        return this.strike == 3;
    }
    
}
