package duke.models;

import duke.exceptions.DukeException;

import static java.util.Objects.requireNonNull;

public class Tag {
    public String tagName;

    public final String IN_USE = "in-use";
    public  final String NOT_IN_USE = "not-in-use";
    public  final String UNAUTHORIZED = "unauthorized";
    public  final String BROKEN = "broken";
    public final String INVALID_TAG_NAME = "Tag names can either be <in-use>,<not-in-use>,"
            + "<unauthorized> or <broken>";

    public Tag(String tagName) throws DukeException {
        requireNonNull(tagName);
        if(!checkValidTagName(tagName)) {
            throw new DukeException(INVALID_TAG_NAME);
        }
        this.tagName = tagName;

    }

    public boolean checkValidTagName(String test) {
        return (test.equalsIgnoreCase(IN_USE) || test.equalsIgnoreCase(NOT_IN_USE)
                || test.equalsIgnoreCase(UNAUTHORIZED) || test.equalsIgnoreCase(BROKEN));
    }

    public String toString() {
        return "[" + tagName + "]";
    }
}
