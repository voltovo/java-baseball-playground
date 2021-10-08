package study;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import org.junit.jupiter.api.BeforeEach;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    };

    // Test Case 구현

    // set Size Check
    @Test
    void setCheckSize() {
        assertThat(numbers).hasSize(3);
    }

    // ParameterizedTest apply
    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3 })
    void isBlank_ShouldReturnTrueForNullOrBlankStrings(int input) {
        assertThat(numbers.contains(input)).isTrue();
    }

}
