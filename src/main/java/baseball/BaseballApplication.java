package baseball;

import baseball.domain.Game;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.io.IOException;

public class BaseballApplication {

    public static void main(String[] args) throws IOException {
        BaseballController baseballController = new BaseballController();
        baseballController.run();
    }
}
