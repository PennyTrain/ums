package main.java.university;

import main.java.university.Globals.Role;
import main.java.university.Globals.ActiveStatus;

public class Admin extends User {

    public Admin(int id, String firstName, String lastName,
                 String email, String department, ActiveStatus active) {

        super(id, firstName, lastName, email, department,
                Role.ADMIN, active);
    }
}