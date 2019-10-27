package duke.models.locker;

import duke.exceptions.DukeException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import static java.util.Objects.requireNonNull;

public class LockerDate {

    public static final String ERROR_MESSAGE = " The date should be a valid date as per the"
            + " Gregorian Calendar and should be in the format <DD-MM-YYYY>";

    private static final DateTimeFormatter checkDateFormat =
            DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public final String date;

    public LockerDate(String date) throws DukeException {
        requireNonNull(date);
        if (!checkIsValidDate(date)) {
            throw new DukeException(ERROR_MESSAGE);
        }
        this.date = date;
    }

    public static boolean checkIsValidDate(String date) {
        try {
            LocalDate.parse(date,checkDateFormat);
        } catch (DateTimeParseException e) {
            return false;
        }
        return true;
    }
}
