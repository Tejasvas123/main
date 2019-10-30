package duke.logic.commands;

import duke.exceptions.DukeException;
import duke.models.LockerList;
import duke.models.locker.Locker;
import duke.models.locker.SerialNumber;
import duke.models.tag.Tag;

import java.util.List;
import java.util.function.Predicate;

public class CommandCheck {

    public static List<Locker> findLockersInAnyZone(LockerList lockerList) throws DukeException {
        Tag checkAvailableTag = new Tag(Tag.NOT_IN_USE);
        return lockerList.getMatchingLockers(findLocker());
    }

    public static boolean isAlreadyPresent(SerialNumber serialNumber,LockerList lockerList) throws DukeException {
         if ((lockerList.getMatchingLockers(p -> p.getSerialNumber().equals(serialNumber)))
                 .size() > 0) {
            throw new DukeException(" Duplicate entries are not allowed. All serial numbers" +
                    " must be unique");
         }
         return true;
    }
    private static Predicate<Locker> findLocker() throws DukeException {
        Tag checkTag = new Tag(Tag.NOT_IN_USE);
        return p -> p.getTag().equals(checkTag);
    }
}
