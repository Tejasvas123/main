package duke.models.student;

import duke.exceptions.DukeException;

import static java.util.Objects.requireNonNull;

public class MatricNumber {

    public static final String ERROR_MESSAGE = " Matriculation number should contain only "
            + "alpha numeric characters and should have only 9 characters. It should satisfy"
            + "the following constraints:"
            + "\n 1. It should start with the character 'A'"
            + "\n 2. It should end with a letter"
            + "\n 3. It should contain only digits between the first and the last character";

    public static final String CHECK_REGEX = "[Aa]\\d{7}[a-zA-Z]";

    public final String matricId;

    public MatricNumber(String matricId) throws DukeException {
        requireNonNull(matricId);
        if (!checkIsValidMatricNumber(matricId)) {
            throw new DukeException(ERROR_MESSAGE);
        }
        this.matricId = matricId;
    }

    public static boolean checkIsValidMatricNumber(String matricId) {
        return matricId.matches(CHECK_REGEX);
    }

    public String getStudentCourse() {
        return matricId;
    }
}
