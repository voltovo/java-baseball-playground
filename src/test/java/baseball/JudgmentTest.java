package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class JudgmentTest {
    
    private Ball com;

    @BeforeEach
    void setUp() {
        com = new Ball(1, 4);

    }
    
    @Test
    void strike() {
        JudgmentStatus result = com.play(new Ball(1, 4));
        assertThat(result).isEqualTo(JudgmentStatus.STRIKE);
    }

    @Test
    void ball() {
        JudgmentStatus result = com.play(new Ball(2, 4));
        assertThat(result).isEqualTo(JudgmentStatus.BALL);
    }

    @Test
    void nothing() {
        JudgmentStatus result = com.play(new Ball(2, 5));
        assertThat(result).isEqualTo(JudgmentStatus.NOTHING);
    }
    
}
