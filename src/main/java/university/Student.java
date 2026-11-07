package university;

public class Student extends User {
    private Globals.StudyMode studyMode;
    private Globals.StudyLevel studyLevel;
    private boolean international;

    public Student(int id, String firstName, String lastName,
                   String email, String department,
                   Globals.StudyMode studyMode,
                   Globals.StudyLevel studyLevel,
                   boolean international) {

        super(id, firstName, lastName, email, department);

        this.studyMode = studyMode;
        this.studyLevel = studyLevel;
        this.international = international;
    }

    public Globals.StudyMode getStudyMode() {
        return studyMode;
    }

    public Globals.StudyLevel getStudyLevel() {
        return studyLevel;
    }

    public boolean isInternational() {
        return international;
    }

    @Override
    public String getRole() {
        return "Student";
    }
}