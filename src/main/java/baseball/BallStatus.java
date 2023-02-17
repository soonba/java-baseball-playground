package baseball;

public enum BallStatus {
    STRIKE,
    BALL,
    NOTHING;

    boolean isNothing() {
        return this.equals(BallStatus.NOTHING);
    }

    boolean isStrike() {
        return this.equals(BallStatus.STRIKE);
    }

    boolean isBall() {
        return this.equals(BallStatus.BALL);
    }

}
