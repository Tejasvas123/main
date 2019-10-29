package duke.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import duke.models.locker.Locker;
import duke.models.locker.SerialNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.Objects.requireNonNull;

public class LockerList {

    private List<Locker> lockerList;

    public LockerList(List<Locker> lockerList) {
        this.lockerList = lockerList;
    }

    public LockerList() {
        lockerList = new ArrayList<>();
    }

    public boolean isPresentLocker(Locker newLocker) {
        return lockerList.stream()
                .anyMatch(locker -> locker.isPresent(newLocker));
    }

    public boolean areLockersPresent(List<Locker> newLockers) {
        requireNonNull(newLockers);
        for (Locker newLocker: newLockers) {
            if (isPresentLocker(newLocker)) {
                return true;
            }
        }
        return false;
    }

    public void addLocker(Locker locker) {
        lockerList.add(locker);
    }

    public void addLockerInPosition(Locker locker, int index) {
        lockerList.set(index,locker);
    }

    public void addAllLockersInList(List<Locker> lockers) {
        lockerList.addAll(lockers);
    }

    public void deleteLocker(Locker locker) {
        lockerList.remove(locker);
    }

    public Locker getLocker(int index) {
        return lockerList.get(index);
    }

    public int getIndexOfLocker(Locker locker) {
        return lockerList.indexOf(locker);
    }

    public int numLockers() {
        return lockerList.size();
    }

    public List<Locker> getMatchingLockers(Predicate<Locker> isMatching) {
        return lockerList.stream()
                .filter(isMatching)
                .collect(Collectors.toList());
    }

    public List<Locker> getAllLockers() {
        return lockerList;
    }

    @JsonGetter("lockers")
    public List<Locker> getLockerList() {
        return lockerList;
    }

    @JsonSetter("lockers")
    public void setLLockerList(List<Locker> lockerList) {
        this.lockerList = lockerList;
    }

}
