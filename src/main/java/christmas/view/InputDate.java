package christmas.view;

import camp.nextstep.edu.missionutils.Console;
import christmas.message.ErrorMessage;

import java.util.regex.Pattern;

public class InputDate {
    private static final Pattern PATTERN = Pattern.compile("\\d+");
    private static final String startMessage = "안녕하세요! 우테코 식당 12월 이벤트 플래너입니다.";
    private static final String askDate = "12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)";

    private static int date;
    private static String inputDate;
    public int inputDate(){
        System.out.println(startMessage);
        System.out.println(askDate);
        inputDate = Console.readLine();
        validateInputDate(inputDate);
        date = Integer.parseInt(inputDate);
        return date;
    }

    private void validateInputDate(String date) {
        if (!PATTERN.matcher(date).matches()) {
            throw new IllegalArgumentException(ErrorMessage.DATE_ERROR);
        }
    }

    public static int getDate(){
        return date;
    }

}
