package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private List<Ball> balls;

    public Balls(List<Integer> answers) {
        this.balls = mapToBall(answers);

    }
    
    public PlayResult play(List<Integer> answers) {
        Balls userBalls = new Balls(answers);
        PlayResult result = new PlayResult();

        for (Ball ball : balls) {
            JudgmentStatus status = userBalls.play(ball);
            result.report(status);
        }

        return result;
    }
    
    public JudgmentStatus play(Ball userBall) {
        return balls.stream()
        .map(answers -> answers.play(userBall))
        .filter(status -> status.isNotNothing())
        .findFirst()
                .orElse(JudgmentStatus.NOTHING);
    }
    
    public List<Ball> mapToBall(List<Integer> answers) {
        List<Ball> numbers = new ArrayList<>();
        for (int i = 0; i < answers.size(); i++) {
            numbers.add(new Ball(i + 1, answers.get(i)));
        }
        return numbers;
    }
}
