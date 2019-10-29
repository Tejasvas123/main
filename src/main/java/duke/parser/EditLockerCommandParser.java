package duke.parser;

import duke.exceptions.DukeException;
import duke.logic.commands.Command;
import duke.logic.commands.EditLockerCommand;
import duke.models.locker.Locker;
import duke.models.locker.SerialNumber;
import duke.parser.utilities.MapTokensToArguments;
import duke.parser.utilities.ParserTokenizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static duke.parser.utilities.Syntax.*;
import static java.util.Objects.requireNonNull;

public class EditLockerCommandParser {
    private List<String> splitInput;

    /**
     * This function is used to parse the user input for editing the status of a locker.
     * @param userInput stores the user input
     * @return reference to the class EditLockerCommand
     * @throws DukeException when the user input is invalid
     */
    public Command parse(String userInput) throws DukeException {
        requireNonNull(userInput);
        MapTokensToArguments mapTokensToArguments = ParserTokenizer
                .tokenize(userInput,TOKEN_SERIAL,TOKEN_ADDRESS,TOKEN_ZONE,
                        TOKEN_STUDENT_NAME,TOKEN_STUDENTID,TOKEN_EMAIL,TOKEN_STUDENT_COURSE,
                        TOKEN_START_DATE,TOKEN_END_DATE);
        SerialNumber serialNumber = ParserCheck.parseSerialNumber(mapTokensToArguments
                .getTextBeforeFirstToken());



    }

    private static Locker getLockerFromSerialNumber(SerialNumber serialNumber) {
        return
    }
}
