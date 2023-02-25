package baseball.domain;

public enum BallStatus {
    STRIKE,
    BALL,
    NOTHING;

    public boolean isNothing() {
        return this.equals(BallStatus.NOTHING);
    }

    public boolean isStrike() {
        return this.equals(BallStatus.STRIKE);
    }

    public boolean isBall() {
        return this.equals(BallStatus.BALL);
    }

}
