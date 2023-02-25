package baseball;

import baseball.domain.Ball;
import baseball.domain.BallStatus;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BallTest {

    @Test
    void 입력은_1에서_9사이() {
        assertThatThrownBy(() -> new Ball(0,0)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 입력은_1에서_9사이2() {
        assertThatThrownBy(() -> new Ball(0,10)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 입력은_1에서_9사이3() {
        Ball ball = new Ball(0,5);
        assertThat(ball.getValue()).isEqualTo(5);
    }

    @Test
    void 볼_스트라이크() {
        Ball ball = new Ball(0,1);
        Ball userBall = new Ball(0,1);
        assertThat(ball.play(userBall)).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void 볼_볼() {
        Ball ball = new Ball(0,1);
        Ball userBall = new Ball(2,1);
        assertThat(ball.play(userBall)).isEqualTo(BallStatus.BALL);
    }

    @Test
    void 볼_낫싱() {
        Ball ball = new Ball(0,1);
        Ball userBall = new Ball(2,5);
        assertThat(ball.play(userBall)).isEqualTo(BallStatus.NOTHING);
    }
}
