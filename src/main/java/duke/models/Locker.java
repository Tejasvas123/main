package duke.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Locker {
    private int serialNumber;
    private String address;
    private String zone;
    private Tag tag;

    @JsonCreator
    public Locker(@JsonProperty("serial") int serialNumber,@JsonProperty("address") String address,
                  @JsonProperty("zone") String zone,@JsonProperty("tag") Tag tag) {
        this.serialNumber = serialNumber;
        this.address = address;
        this.zone = zone;
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

    @JsonGetter("tag")
    public Tag getTag() {
        return tag;
    }

    @JsonGetter("serialNumber")
    public int getSerialNumber() {
        return serialNumber;
    }

    @JsonGetter("address")
    public String getAddress() {
        return address;
    }

    @JsonGetter("zone")
    public String getZone() {
        return zone;
    }

    public String toString() {
        return "Locker #" + getSerialNumber() +": " + "Area: " + address + " Zone: " + zone
                + " [" + getTag().tagName +"]";
    }

}
