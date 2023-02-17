package baseball;

import java.io.IOException;

public class BaseballController {

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
