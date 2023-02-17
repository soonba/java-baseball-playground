package baseball;

import java.io.IOException;

public class Game {
    private final Balls comBalls = RandomBallsGenerator.apply();
    private final Baseball baseball = new Baseball(comBalls);

    void start() throws IOException {
        OutputView.printStartMessage();
        while (!baseball.endGame()) {
            OutputView.printInputRequestMessage();
            String read = InputView.readNumber();
            PlayResult aResult = baseball.play(Baseball.mapToBallList(read));
            OutputView.printResult(aResult);
        }
        OutputView.printEndMessage();
    }
}
