package baseball;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ComputerNumberTest {
    
    @Test
    void randomNumberListSizeValidation() {
        //size validation
        assertThat(Validation.validListSize(ComputerNumber.createRandom())).isTrue();
    }
    
    @Test
    void randomNumberRangeValidation() {
        //number range validation
        ComputerNumber.createRandom().stream()
                        .forEach(num -> assertThat(Validation.validNo(num)).isTrue());
    }
}
