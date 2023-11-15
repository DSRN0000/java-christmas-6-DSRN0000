package christmas.view;

import java.text.DecimalFormat;

public class FormatNumber {
    public String formatNumber(int number) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");

        return decimalFormat.format(number);
    }
}
