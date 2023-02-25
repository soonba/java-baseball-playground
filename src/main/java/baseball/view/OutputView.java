package baseball.view;

import baseball.domain.PlayResult;

public class OutputView {

    public static void printResult(PlayResult playResult) {
        StringBuilder sb = new StringBuilder();
        if(playResult.isNothing()) sb.append("낫싱");
        if(playResult.hasBall()) sb.append(playResult.getBall()).append("볼 ");
        if(playResult.hasStrike()) sb.append(playResult.getStrike()).append("스트라이크");
        System.out.println(sb);
    }

    public static void printEndMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static void printReGameMessage() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public static void printStartMessage() {
        System.out.println("새 게임을 시작합니다.");
    }

    public static void printInputRequestMessage() {
        System.out.print("숫자를 입력해 주세요 : ");
    }
}
