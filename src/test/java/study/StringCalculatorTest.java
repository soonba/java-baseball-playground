package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import study.stringCalculator.StringCalculator;

public class StringCalculatorTest {

    private static StringCalculator stringCalculator;

    @BeforeAll
    static void setUpAll() {
        stringCalculator = new StringCalculator();
    }

    @Test
    void calculate1() {
        String[] strArr = "2 + 3 * 4 / 2".split(" ");
        int calculate = stringCalculator.calculate(strArr);
        Assertions.assertThat(calculate).isEqualTo(10);
    }

    @Test
    void calculate2() {
        String[] strArr = "2 * 3 - 4 / 2".split(" ");
        int calculate = stringCalculator.calculate(strArr);
        Assertions.assertThat(calculate).isEqualTo(1);
    }
}
