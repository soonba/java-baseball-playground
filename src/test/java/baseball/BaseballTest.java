package baseball;

import baseball.domain.Ball;
import baseball.domain.Balls;
import baseball.domain.Baseball;
import baseball.domain.PlayResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BaseballTest {

    private static Baseball baseball;

    @BeforeEach
    void setup() {
        List<Ball> ballList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ballList.add(new Ball(i + 1, i + 2));
        }
        Balls comBalls = new Balls(ballList);
        baseball = new Baseball(comBalls);
    }

    @Test
    void 입력값_파싱() {
        List<Ball> balls = Baseball.mapToBallList("123");
        Ball ball = new Ball(2, 2);
        assertThat(ball.equals(balls.get(1))).isTrue();
    }

    @Test
    void 입력값_에러_숫자아님() {
        assertThatThrownBy(() -> {
            List<Ball> balls = Baseball.mapToBallList("1r3");
        }).isInstanceOf(NumberFormatException.class);
    }

    @Test
    void 입력값_에러_길이() {
        assertThatThrownBy(() -> {
            List<Ball> balls = Baseball.mapToBallList("1632");
        }).isInstanceOf(InvalidParameterException.class);
    }

    @Test
    void 입력값_에러_중복숫자() {
        assertThatThrownBy(() -> {
            List<Ball> balls = Baseball.mapToBallList("111");
        }).isInstanceOf(InvalidParameterException.class);
    }

    @Test
    void 원스트라이크_노볼() {
        List<Ball> balls = Baseball.mapToBallList("738");
        PlayResult result = baseball.play(balls);
        assertThat(result.getBall()).isEqualTo(0);
        assertThat(result.getStrike()).isEqualTo(1);
    }

    @Test
    void 원스트라이크_원볼() {
        List<Ball> balls = Baseball.mapToBallList("394");
        PlayResult result = baseball.play(balls);
        assertThat(result.getBall()).isEqualTo(1);
        assertThat(result.getStrike()).isEqualTo(1);
    }

    @Test
    void 투스트라이크() {
        List<Ball> balls = Baseball.mapToBallList("264");
        PlayResult result = baseball.play(balls);
        assertThat(result.getBall()).isEqualTo(0);
        assertThat(result.getStrike()).isEqualTo(2);
    }

    @Test
    void 낫싱() {
        List<Ball> balls = Baseball.mapToBallList("876");
        PlayResult result = baseball.play(balls);
        assertThat(result.getBall()).isEqualTo(0);
        assertThat(result.getStrike()).isEqualTo(0);
    }

    @Test
    void 쓰리스트라이크() {
        List<Ball> balls = Baseball.mapToBallList("234");
        PlayResult result = baseball.play(balls);
        assertThat(result.getBall()).isEqualTo(0);
        assertThat(result.getStrike()).isEqualTo(3);
    }
}
