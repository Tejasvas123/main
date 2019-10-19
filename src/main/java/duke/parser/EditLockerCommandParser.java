package duke.parser;

import duke.exceptions.DukeException;
import duke.logic.commands.Command;
import duke.logic.commands.EditLockerCommand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EditLockerCommandParser {
    private List<String> splitInput;

    public Command parse(String fullCommand) throws DukeException {
        if (fullCommand.trim().length() == 4) {
            throw new DukeException(" The description of edit command cant be empty");
        }

        splitInput = new ArrayList<String>(Arrays.asList(fullCommand.split(" ")));
        return new EditLockerCommand(splitInput);
    }
}
