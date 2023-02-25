package baseball;

import baseball.domain.Game;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.io.IOException;

public class BaseballController {
    static boolean allGameEnd = false;
    void run () throws IOException {
        while(!allGameEnd) {
            Game game = new Game();
            game.start();
            OutputView.printReGameMessage();
            allGameEnd = InputView.readReGame();
        }
    }
}
