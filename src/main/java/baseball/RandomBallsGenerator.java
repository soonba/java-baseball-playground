package baseball;

import java.util.ArrayList;
import java.util.List;

public class RandomBallsGenerator {

    static int nowNum;
    static List<Ball> ballList = new ArrayList<>();
    static List<Integer> numList = new ArrayList<>();

    static Balls apply() {
        while (numList.size() < 3) {
            nowNum = (int) ((Math.random() * 9) + 1);
            addIfNewNumber();
        }

        return new Balls(ballList);
    }

    private static void addIfNewNumber() {
        if (!numList.contains(nowNum)) {
            ballList.add(new Ball(numList.size() + 1, nowNum));
            numList.add(nowNum);
        }
    }
}
