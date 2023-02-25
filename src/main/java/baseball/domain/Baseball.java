package baseball.domain;

import java.security.InvalidParameterException;
import java.util.*;

public class Baseball {

    private static final Integer BALL_SIZE = 3;

    private final Balls comBalls;
    private boolean gameEnd = false;

    public Baseball(Balls comBalls) {
        this.comBalls = comBalls;
    }
    public PlayResult play(List<Ball> balls) {
        PlayResult result = new PlayResult();
        for (Ball aBall : balls) {
            result.apply(comBalls.play(aBall));
        }
        if(result.isEnd()) {
            gameEnd = true;
        }
        return result;
    }

    public boolean endGame() {
        return gameEnd;
    }

    public static List<Ball> mapToBallList(String s) throws NumberFormatException, InvalidParameterException {
        String[] split = s.split("");
        if(split.length != BALL_SIZE) {
            throw new InvalidParameterException("3자리 숫자를 입력해주세요.");
        }

        Set<String> validSet = new HashSet<>(Arrays.asList(split));
        if(validSet.size() != BALL_SIZE) {
            throw new InvalidParameterException("중복된 숫자가 없게 해주세요.");
        }

        List<Ball> ballList = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            ballList.add(new Ball(i+1, Integer.parseInt(split[i])));
        }
        return ballList;
    }
}
