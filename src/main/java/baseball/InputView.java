package baseball;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    static String readNumber() throws IOException {
        return bufferedReader.readLine();
    }

    static boolean readReGame() throws IOException {
        return bufferedReader.readLine().equals("2");
    }
}
