package duke.logic.commands;

import duke.exceptions.DukeException;
import duke.models.locker.Locker;
import duke.models.LockerList;
import duke.storage.FileHandling;
import duke.ui.Ui;

import static java.util.Objects.requireNonNull;


public class AddLockerCommand extends Command {

    private final Locker addLocker;

    public AddLockerCommand(Locker addLocker) {
        requireNonNull(addLocker);
        this.addLocker = addLocker;
    }

    @Override
    public void execute(LockerList lockerList, Ui ui, FileHandling storage) throws DukeException {
        requireNonNull(lockerList);
        requireNonNull(ui);
        requireNonNull(storage);
<<<<<<< HEAD
        if (lockerList.isPresentLocker(addLocker)) {
            throw new DukeException(" Duplicate entries not allowed. The serial number " +
                    "should be unique.");
        }
=======
>>>>>>> f1dd864f11cdbb6b26f1e2952107be62f90ac32d
        lockerList.addLocker(addLocker);
        String lockerA = addLocker.toString();
        ui.printAddLocker(lockerList.getAllLockers(),lockerA);
        storage.saveData(lockerList);
    }
}
