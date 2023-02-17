package baseball;

public class OutputView {

    static void printResult(PlayResult playResult) {
        if(playResult.isNothing()) {
            System.out.println("낫싱");
            return;
        }
        System.out.println(playResult.getBall()+"볼 "+ playResult.getStrike()+"스트라이크");
    }

    static void printEndMessage() {
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
