package baseball;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class InputNumberTest {
    @Test
    void inputNumberValidation() {
        assertThat(InputNumber.validNo(9)).isTrue();
        assertThat(InputNumber.validNo(1)).isTrue();
        assertThat(InputNumber.validNo(0)).isFalse();
        assertThat(InputNumber.validNo(10)).isFalse();
    }

}
