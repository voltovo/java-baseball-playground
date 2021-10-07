package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

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
        assertThat(values).contains("1", "2");
    }

    @Test
    void splitTwo() {
        String[] values = "1".split(",");
        assertThat(values).containsExactly("1");
    }

    @Test
    void splitThree() {
        String value = "(1,2)".substring(1, 4);
        assertThat(value).isEqualTo("1,2");
    }

    @Test
    @DisplayName("특정 위치 문자 가져오기1")
    void charGetFromString1() {
        String text = "abc";
        int index = 1;

        char value = text.charAt(index);
        assertThat(value).isEqualTo('b');

    }

    @Test
    @DisplayName("특정 위치 문자 가져오기2")
    void charGetFromString2() {
        String text = "abc";
        int index = 3;
        assertThatThrownBy(() -> {
            text.charAt(index);
        }).isInstanceOf(IndexOutOfBoundsException.class).hasMessageContaining("%d", index);
    }

    @Test
    @DisplayName("특정 위치 문자 가져오기3")
    void charGetFromString3() {
        String text = "abc";
        int index = 3;
        assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(() -> {
            text.charAt(index);
        }).withMessageMatching("String index out of range: \\d");
    }
}
