package study.stringCalculator;

public class StringCalculator {

    public int calculate(String[] strArr) {
        int value = 0;
        //첫번째에 부호가 올 수 있는지에 따라 추가 필요
        value += Integer.parseInt(strArr[0]);
        for (int i = 1; i < strArr.length; i = i+2) {
            value = calculateByToken(value, strArr[i], strArr[i+1]);
        }
        return value;
    }

    private int calculateByToken(int value, String s, String s1) {
        if(s.equals("+")) {
            return value + Integer.parseInt(s1);
        }
        if(s.equals("-")) {
            return value - Integer.parseInt(s1);
        }
        if(s.equals("*")) {
            return value * Integer.parseInt(s1);
        }
        if(s.equals("/")) {
            return value / Integer.parseInt(s1);
        }

        throw new IllegalArgumentException("연산자를 올바르게 입력하세요.");
    }

}
