package common.validator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ValidatorTime {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private ValidatorTime(){}

    public static boolean isValidDate(String dateStr) {
        try {
            LocalDateTime.parse(dateStr, FORMATTER);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
