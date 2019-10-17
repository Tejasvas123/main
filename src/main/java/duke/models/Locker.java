package duke.models;

public class Locker {
    int serialNumber;
    Tag tag;

    public Locker(int serialNumber,Tag tag) {
        this.serialNumber = serialNumber;
        this.tag = tag;
    }

    public void setTagAsInUse() {
        tag.tagName = tag.IN_USE;
    }

    public void setStatusAsBroken() {
        tag.tagName = tag.BROKEN;
    }

    public void setStatusAsUnAuthorized() {
        tag.tagName = tag.UNAUTHORIZED;
    }

    public void setStatusAsNotInUse() {
        tag.tagName = tag.NOT_IN_USE;
    }

    public Tag getTag() {
        return tag;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

}
