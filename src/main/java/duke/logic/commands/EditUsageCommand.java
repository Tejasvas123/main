package duke.logic.commands;

import duke.models.locker.LockerDate;
import duke.models.student.Email;
import duke.models.student.Major;
import duke.models.student.MatricNumber;
import duke.models.student.Name;

import java.util.Optional;

public class EditUsageCommand {

    public static class EditStudent {
        private Name name;
        private Email email;
        private MatricNumber matricNumber;
        private Major major;

        public EditStudent() {}

        public EditStudent(EditStudent copyStudent) {
            setName(copyStudent.name);
            setMatricNumber(copyStudent.matricNumber);
            setEmail(copyStudent.email);
            setMajor(copyStudent.major);
        }

        public void setName(Name name) {
            this.name = name;
        }

        public void setEmail(Email email) {
            this.email = email;
        }

        public void setMatricNumber(MatricNumber matricNumber) {
            this.matricNumber = matricNumber;
        }

        public void setMajor(Major major) {
            this.major = major;
        }

        public Optional<Name> getName() {
            return Optional.ofNullable(name);
        }

        public Optional<Email> getEmail() {
            return Optional.ofNullable(email);
        }

        public Optional<MatricNumber> getMatricNumber() {
            return Optional.ofNullable(matricNumber);
        }

        public Optional<Major> getMajor() {
            return Optional.ofNullable(major);
        }
    }

    public static class EditLockerDate {
        private LockerDate startDate;
        private LockerDate endDate;

        public EditLockerDate() {}

        public EditLockerDate(EditLockerDate copyEditDate) {
            setStartDate(copyEditDate.startDate);
            setEndDate(copyEditDate.endDate);
        }

        public void setStartDate(LockerDate startDate) {
            this.startDate = startDate;
        }

        public void setEndDate(LockerDate endDate) {
            this.endDate = endDate;
        }

        public Optional<LockerDate> getStartDate() {
            return Optional.ofNullable(startDate);
        }

        public Optional<LockerDate> getEndDate() {
            return Optional.ofNullable(endDate);
        }
    }
}

