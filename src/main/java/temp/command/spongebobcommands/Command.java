package duke.command.spongebobcommands;

import duke.exceptions.DukeException;
import duke.storage.FileHandling;
import duke.models.LockerList;
import duke.ui.Ui;
;
public abstract class Command {
    public boolean isExit = false;

    public boolean isExit() {
        return this.isExit;
    }

    public abstract void execute(LockerList lockers, Ui ui, FileHandling storage) throws DukeException;
}
