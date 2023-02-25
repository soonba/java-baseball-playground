package baseball.domain;

public class Ball {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9;
    private final int value;
    private final int location;

    public Ball(int location, int num) {
        this.location = location;
        this.value = validateValue(num);
    }

    private static int validateValue(int num) {
        if (!(num >= MIN_NUMBER && num <= MAX_NUMBER)) {
            throw new IllegalArgumentException("값은 1부터 9사이 여야합니다.");
        }
        return num;
    }

    public int getValue() {
        return value;
    }

    public BallStatus play(Ball userBall) {
        if (this.equals(userBall)) {
            return BallStatus.STRIKE;
        }
        if (this.getValue() == userBall.getValue()) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return value == ball.value && location == ball.location;
    }

}
