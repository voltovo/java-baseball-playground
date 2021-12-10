package baseball;

public class Ball {
    private int position;
    private int ballNo;

    public Ball(int position, int ballNo) {
        this.position = position;
        this.ballNo = ballNo;

    }

    public String toString() {
        return "position = " + this.position + " / ballNo = " + this.ballNo;
    }
    
    public JudgmentStatus play(Ball ball) {
        if (this.equals(ball)) {
            return JudgmentStatus.STRIKE;
        }
        if (ball.matchBallNo(ballNo)) {
            return JudgmentStatus.BALL;
        }
        return JudgmentStatus.NOTHING;
    }

    private boolean matchBallNo(int ballNo) {
        return this.ballNo == ballNo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Ball ball = (Ball) obj;
        return position == ball.position && ballNo == ball.ballNo;
    }
}
