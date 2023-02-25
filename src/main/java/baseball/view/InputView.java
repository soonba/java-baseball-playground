package baseball.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    private static final String END_GAME_COMMAND = "2";

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static String readNumber() throws IOException {
        return bufferedReader.readLine();
    }

    public static boolean readReGame() throws IOException {
        return bufferedReader.readLine().equals(END_GAME_COMMAND);
    }
}
