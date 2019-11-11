package duke.logic.commands;


import duke.log.Log;
import duke.models.LockerList;
import duke.storage.Storage;
import duke.ui.Ui;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Command to list all the lockers.
 */
public class ListCommand extends Command {

    public static final String COMMAND_WORD = "list";
    private static final Logger logger = Log.getLogger();

    @Override
    public void execute(LockerList lockerList, Ui ui, Storage storage) {
        logger.log(Level.INFO, "Executing list command");
        ui.printList(lockerList.getLockerList());
    }
}
