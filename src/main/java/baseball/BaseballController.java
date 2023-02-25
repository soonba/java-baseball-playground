package baseball;

import baseball.domain.Balls;
import baseball.domain.Game;
import baseball.utils.RandomBallsGenerator;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.io.IOException;

public class BaseballController {
    static boolean allGameEnd = false;
    void run () throws IOException {
        while(!allGameEnd) {
            Balls comBalls = RandomBallsGenerator.apply();
            Game game = new Game(comBalls);
            game.start();
            OutputView.printReGameMessage();
            allGameEnd = InputView.readReGame();
        }
    }
}
