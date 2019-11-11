package duke.logic.commands;

import duke.log.Log;
import duke.models.LockerList;
import duke.storage.Storage;
import duke.ui.Ui;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Command for exiting SpongeBob.
 */
public class ByeCommand extends Command {
    public static final String COMMAND_WORD = "bye";
    private static final Logger logger = Log.getLogger();

    @Override
    public void execute(LockerList lockerList, Ui ui, Storage storage) {
        logger.log(Level.INFO, " Executing command for exiting SpongeBob");
        this.isExit = true;
        ui.exitSpongeBob();
    }
}
