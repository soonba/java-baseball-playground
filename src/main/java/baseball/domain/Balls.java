package baseball.domain;

import baseball.domain.constants.BallStatus;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private final List<Ball> ballList;

    public Balls(List<Ball> ballList) {
        this.ballList = ballList;
    }


    public BallStatus play(Ball comBall) {

        List<BallStatus> ballStatusList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ballStatusList.add(ballList.get(i).play(comBall));
        }
        return ballStatusList.stream().filter(ballStatus -> !ballStatus.isNothing())
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }

}
