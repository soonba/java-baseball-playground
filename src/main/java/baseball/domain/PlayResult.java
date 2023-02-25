package baseball.domain;

public class PlayResult {

    private static final Integer END_GAME_STRIKE_CONDITION = 3;
    private static final Integer INIT_COUNT = 0;
    private int ball = INIT_COUNT;
    private int strike = INIT_COUNT;

    public boolean isNothing() {
        return ball == INIT_COUNT && strike == INIT_COUNT;
    }
    public boolean hasBall() { return ball != INIT_COUNT; }
    public boolean hasStrike() { return strike != INIT_COUNT; }

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
        return this.strike == END_GAME_STRIKE_CONDITION;
    }
}
