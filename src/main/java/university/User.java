package main.java.university;

import com.google.gson.annotations.SerializedName;

import main.java.university.Globals.Role;
import main.java.university.Globals.ActiveStatus;

public abstract class User {

    private int id;
//I use this to stay with naming conventions
    @SerializedName("first_name")
    private String firstName;

    @SerializedName("last_name")
    private String lastName;

    private String email, department;

    private Role role;
    private ActiveStatus active;

    public User(int id, String firstName, String lastName,
                String email, String department,
                Role role, ActiveStatus active) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.role = role;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }

    public Role getRole() {
        return role;
    }

    public ActiveStatus getActive() {
        return active;
    }

    public void setActive(ActiveStatus active) {
        this.active = active;
    }

    public boolean isActive() {
        return active == ActiveStatus.ACTIVE;
    }

    @Override
    public String toString() {
        return id + ": " + getFullName()
                + " | " + role
                + " | " + active;
    }
}