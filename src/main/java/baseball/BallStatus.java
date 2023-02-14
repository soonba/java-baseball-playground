package baseball;

public enum BallStatus {
    STRIKE,
    BALL,
    NOTHING;

    boolean isNothing() {
        return this.equals(BallStatus.NOTHING);
    }
}
