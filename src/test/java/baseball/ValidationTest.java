package baseball;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

public class ValidationTest {
    @Test
    void numberRangeValidation() {
        assertThat(Validation.validNo(9)).isTrue();
        assertThat(Validation.validNo(1)).isTrue();
        assertThat(Validation.validNo(0)).isFalse();
        assertThat(Validation.validNo(10)).isFalse();
    }

    @Test
    void numberOverlapValidation() {
        assertThat(Validation.validOverlap(Arrays.asList(3), 1)).isFalse();
        assertThat(Validation.validOverlap(Arrays.asList(2, 4), 4)).isTrue();
        assertThat(Validation.validOverlap(Arrays.asList(1, 2, 3), 1)).isTrue();
    }

    @Test
    void numberListSizeValidation() {
        assertThat(Validation.validListSize(Arrays.asList(1))).isFalse();
        assertThat(Validation.validListSize(Arrays.asList(1, 2))).isFalse();
        assertThat(Validation.validListSize(Arrays.asList(1, 2, 3))).isTrue();
    }

}
