package baseball.domain;

import baseball.utils.RandomBallsGenerator;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.io.IOException;

public class Game {
    private final Balls comBalls = RandomBallsGenerator.apply();
    private final Baseball baseball = new Baseball(comBalls);

    public void start() throws IOException {
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
