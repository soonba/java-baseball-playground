package baseball.domain;

import baseball.domain.constants.BallStatus;

public class PlayResult {
    private int ball = 0;
    private int strike = 0;

    public boolean isNothing() {
        return ball == 0 && strike == 0;
    }
    public Integer getBall() {
        return ball;
    }

    public Integer getStrike() {
        return strike;
    }

    public void apply(BallStatus status) {
        if(status.isStrike()) {
            strike++;
        }
        if(status.isBall()) {
            ball++;
        }
    }

    public boolean isEnd() {
        return this.strike == 3;
    }
}
