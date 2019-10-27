package duke.models.student;

import static java.util.Objects.requireNonNull;

public class Student {
    private final Name name;
    private final MatricNumber matricNumber;
    private final Email email;
    private final Major major;

    public Student(Name name, MatricNumber matricNumber, Email email, Major major) {
        requireNonNull(name);
        requireNonNull(matricNumber);
        requireNonNull(email);
        requireNonNull(major);
        this.name = name;
        this.matricNumber = matricNumber;
        this.email = email;
        this.major = major;
    }

    public Name getName() {
        return name;
    }

    public MatricNumber getMatricNumber() {
        return matricNumber;
    }

    public Email getEmail() {
        return email;
    }

    public Major getMajor() {
        return major;
    }
}
