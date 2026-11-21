package main.java.university;

public final class Globals {

    private Globals() {
        // Prevents creating a Globals object.
    }

    public enum StudyMode {
        FULL_TIME,
        PART_TIME
    }

    public enum StudyLevel {
        UNDERGRADUATE,
        POSTGRADUATE
    }

    public enum EnrolmentStatus {
        ACTIVE,
        COMPLETED,
        WITHDRAWN
    }

    public enum Role {
        STUDENT,
        STAFF,
        ADMIN
    }

    public enum ActiveStatus {
        ACTIVE,
        INACTIVE
    }
}