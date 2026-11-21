package main.java.university;

import main.java.university.Globals.Role;
import main.java.university.Globals.ActiveStatus;

public class Student extends User {

    private String type;
    private String gender;

    public Student(int id, String firstName, String lastName,
                   String email, String department,
                   String type, String gender, ActiveStatus active) {

        super(id, firstName, lastName, email, department,
                Role.STUDENT, active);

        this.type = type;
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Type: " + type
                + " | Gender: " + gender;
    }
}