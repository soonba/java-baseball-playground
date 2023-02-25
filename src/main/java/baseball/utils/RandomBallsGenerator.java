package baseball.utils;

import baseball.domain.Ball;
import baseball.domain.Balls;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomBallsGenerator {
    static Set<Integer> numSet = new HashSet<>();

    public static Balls apply() {
        while (numSet.size() < 3) {
            numSet.add((int) ((Math.random() * 9) + 1));
        }
        List<Integer> numList = new ArrayList<>(numSet);
        return new Balls(mapBall(numList));
    }

    private static List<Ball> mapBall(List<Integer> numList) {
        List<Ball> ballList = new ArrayList<>();
        for (int i = 0; i < numList.size(); i++) {
            ballList.add(new Ball(i+1, numList.get(i)));
        }
        return ballList;
    }
}
