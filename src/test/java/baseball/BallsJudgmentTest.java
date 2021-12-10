package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

public class BallsJudgmentTest {
    
    private Balls com;

    @BeforeEach
    void setUp() {
        com = new Balls(Arrays.asList(1, 2, 3));
    }

    @Test
    void strike() {
        JudgmentStatus status = com.play(new Ball(1, 1));
        assertThat(status).isEqualTo(JudgmentStatus.STRIKE);
    }

    @Test
    void ball() {
        JudgmentStatus status = com.play(new Ball(1, 2));
        assertThat(status).isEqualTo(JudgmentStatus.BALL);
    }

    @Test
    void nonthing() {
        JudgmentStatus status = com.play(new Ball(1, 4));
        assertThat(status).isEqualTo(JudgmentStatus.NOTHING);
    }
}