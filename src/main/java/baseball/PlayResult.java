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

    public void printReport() {
        if (this.ball > 0) {
            System.out.print(this.ball + " 볼 ");
        }
        if (this.strike > 0) {
            System.out.print(this.strike + " 스트라이크 ");
        }
        if (this.ball == 0 && this.strike == 0) {
            System.out.print("nonthing");
        }
        System.out.println();
    }

    public boolean isEndGame() {
        return this.strike == 3;
    }
    
}
