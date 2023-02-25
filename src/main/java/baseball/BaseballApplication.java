package baseball;

import java.io.IOException;

public class BaseballApplication {

    public static void main(String[] args) throws IOException {
        BaseballController baseballController = new BaseballController();
        baseballController.run();
    }
}
