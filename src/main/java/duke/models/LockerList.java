package duke.models;

import java.util.ArrayList;
import java.util.List;

public class LockerList {

    private List<Locker> lockerList;

    public LockerList(List<Locker> lockerList) {
        this.lockerList = lockerList;
    }

    public LockerList() {
        lockerList = new ArrayList<>();
    }

    public void addLocker(Locker locker) {
        lockerList.add(locker);
    }

    public void deleteLocker(Locker locker) {
        lockerList.remove(locker);
    }

    public List<Locker> getAllLockers() {
        return lockerList;
    }

    public int numTasks() {
        return lockerList.size();
    }
}
