package duke;

import duke.exceptions.DukeException;
import duke.logic.commands.AddLockerCommand;
import duke.logic.commands.ByeCommand;
import duke.logic.commands.Command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parser {

    public static Command parse(String fullCommand) throws DukeException {
        List<String> splitInput = new ArrayList<String>(
                Arrays.asList(fullCommand.split(" ")));
        String inputTask = splitInput.get(0);
        if (inputTask.equalsIgnoreCase("addLocker")) {
            return new AddLockerCommand(splitInput);
        } else if (fullCommand.equalsIgnoreCase("bye")) {
            return new ByeCommand();
        } else {
            throw new DukeException(" Invalid command");
        }
    }
}
