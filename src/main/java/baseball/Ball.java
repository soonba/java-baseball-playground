package baseball;

public class Ball {
    private final int value;

    public Ball(int num) {
        this.value = validate(num);
    }

    private static int validate(int num) {
        if(!(num >= 1 && num <= 9)) {
            throw new IllegalArgumentException("값은 1부터 9사이 여야합니다.");
        }
        return num;
    }

    public int getValue() {
        return value;
    }
}
