package baseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BallTest {

    @Test
    void 입력은_1에서_9사이() {
        assertThatThrownBy(() -> new Ball(0)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 입력은_1에서_9사이2() {
        assertThatThrownBy(() -> new Ball(10)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 입력은_1에서_9사이3() {
        Ball ball = new Ball(5);
        assertThat(ball.getValue()).isEqualTo(5);
    }
}
