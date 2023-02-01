package baseballGame;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumberGenerator {

    static Balls makeNumbers() {
        Set<Ball> ballSet = new HashSet<>();
        Random random = new Random();
        while (ballSet.size() < 3) {
            int num = random.nextInt(9) + 1;
            ballSet.add(new Ball(num));
        }
        return new Balls(ballSet);
    }
}
