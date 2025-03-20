package common.validator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ValidatorTime {
    private final static DateTimeFormatter FORMATTER_FILTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private ValidatorTime(){}

    public static boolean isValidDate(String dateStr) {
        try {
            LocalDate.parse(dateStr, FORMATTER_FILTER);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
