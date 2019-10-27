package duke.models.locker;

import duke.models.student.Student;
import duke.models.tag.Tag;

import static java.util.Objects.requireNonNull;

public class InUseLocker extends Locker {
    private final Student student;
    private final LockerDate startDate;
    private final LockerDate endDate;

    public InUseLocker(SerialNumber serialNumber, Address address, Zone zone, Tag tag,
                       Student student,LockerDate startDate,LockerDate endDate) {
        super(serialNumber,address,zone,tag);
        requireNonNull(student);
        requireNonNull(startDate);
        requireNonNull(endDate);
        this.student = student;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Student getStudent() {
        return student;
    }

    public LockerDate getStartDate() {
        return startDate;
    }

    public LockerDate getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + " Name: " + student.getName().getStudentName()
                + " StudentID:" + student.getMatricNumber().getStudentCourse();
    }

}
