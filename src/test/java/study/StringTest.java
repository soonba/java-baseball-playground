package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String str = "1,2";
        String[] split = str.split(",");
        assertThat(split).containsExactly("1","2");
    }

    @Test
    @DisplayName("charAt 성공 테스트")
    void charAtSuccess() {
        String str = "abc";
        char firstChar = str.charAt(1);
        Character a = 'b';
        assertThat(firstChar).isEqualTo(a);
    }

    @Test
    @DisplayName("charAt exception 테스트")
    void charAtThrowException() {
        String str = "abc";
        assertThatThrownBy(() -> {
            char c = str.charAt(5);
        }).isInstanceOf(IndexOutOfBoundsException.class);
    }
}
