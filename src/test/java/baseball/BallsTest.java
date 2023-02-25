package baseball;

import baseball.domain.Ball;
import baseball.domain.BallStatus;
import baseball.domain.Balls;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {

    private static Balls comBalls;

    @BeforeEach
    void setup() {
        List<Ball> ballList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ballList.add(new Ball(i + 1, i + 2));
        }
        comBalls = new Balls(ballList);
    }

    @Test
    void 볼() {
        Ball ball = new Ball(1, 3);
        BallStatus ballStatus = comBalls.play(ball);
        assertThat(ballStatus).isEqualTo(BallStatus.BALL);
    }

    @Test
    void 스트라이크() {
        Ball ball = new Ball(3, 4);
        assertThat(comBalls.play(ball)).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void 낫싱() {
        Ball ball = new Ball(3, 8);
        BallStatus play = comBalls.play(ball);
        assertThat(play).isEqualTo(BallStatus.NOTHING);
    }


}
