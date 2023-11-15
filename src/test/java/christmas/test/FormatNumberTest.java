package christmas.test;

import christmas.view.FormatNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormatNumberTest {
    @Test
    public void testFormatNumber() {
        FormatNumber formatNumber = new FormatNumber();

        int positiveNumber = 123456789;
        String expectedFormattedNumber = "123,456,789";
        assertEquals(expectedFormattedNumber, formatNumber.formatNumber(positiveNumber));

        int negativeNumber = -987654321;
        expectedFormattedNumber = "-987,654,321";
        assertEquals(expectedFormattedNumber, formatNumber.formatNumber(negativeNumber));

        int zero = 0;
        expectedFormattedNumber = "0";
        assertEquals(expectedFormattedNumber, formatNumber.formatNumber(zero));
    }
}