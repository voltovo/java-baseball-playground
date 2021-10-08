package study;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
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
    void setContainsTest(int input) {
        assertThat(numbers.contains(input)).isTrue();
    }

    // ParameterizedTest true or false apply
    @ParameterizedTest
    @CsvSource(value = { "1,true", "2,true", "3,true", "4,false", "5,false" }, delimiter = ',')
    void setContainsTrueOrFalse(int input, boolean expected) {
        assertThat(numbers.contains(input)).isEqualTo(expected);
    }
}
