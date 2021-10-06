package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void splitOne() {
        String[] values = "1,2".split(",");
        // containsExactly : 순서 포함해서 정확하게 일치
        assertThat(values).containsExactly("1", "2");
    }

    @Test
    void splitTwo() {
        String[] values = "1".split(",");
        assertThat(values).contains("1");
    }

    @Test
    void splitThree() {
        String value = "(1,2)".substring(1, 4);
        assertThat(value).isEqualTo("1,2");
    }
}
