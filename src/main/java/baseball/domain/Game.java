package baseball.domain;

import baseball.view.ErrorView;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Game {
    private final Baseball baseball;

    public Game(Balls comBalls) {
        this.baseball = new Baseball(comBalls);
    }

    public void start() {
        OutputView.printStartMessage();
        while (!baseball.endGame()) {
            PlayResult aResult = tryPlaying();
            OutputView.printResult(aResult);
        }
        OutputView.printEndMessage();
    }

    private PlayResult tryPlaying() {
        try {
            OutputView.printInputRequestMessage();
            String read = InputView.readNumber();
            return baseball.play(Baseball.mapToBallList(read));
        } catch (Exception e) {
            ErrorView.print(e.getMessage());
            return tryPlaying();
        }
    }
}
