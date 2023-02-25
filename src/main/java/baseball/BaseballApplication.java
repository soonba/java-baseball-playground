package baseball;

import baseball.domain.Game;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.io.IOException;

public class BaseballApplication {

    static boolean allGameEnd = false;
    public static void main(String[] args) throws IOException {
        while(!allGameEnd) {
            Game game = new Game();
            game.start();
            OutputView.printReGameMessage();
            allGameEnd = InputView.readReGame();
        }
    }
}
