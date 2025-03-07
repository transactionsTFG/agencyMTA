package common.validator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ValidatorTime {
    private final static DateTimeFormatter FORMATTER_FILTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private ValidatorTime(){}

    public static boolean isValidDate(String dateStr) {
        try {
            LocalDateTime.parse(dateStr, FORMATTER_FILTER);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
