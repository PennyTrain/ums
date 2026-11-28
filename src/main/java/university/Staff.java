package main.java.university;

import com.google.gson.annotations.SerializedName;
import main.java.university.Globals.Role;
import main.java.university.Globals.ActiveStatus;

public class Staff extends User {
    // stay in naming conventions
    @SerializedName("weekly_hours")
    private int weeklyHours;
    @SerializedName("max_modules")
    private int maxModules;

    public Staff(int id, String firstName, String lastName,
                 String email, String department,
                 int weeklyHours, int maxModules, ActiveStatus active) {

        super(id, firstName, lastName, email, department,
                Role.STAFF, active);

        this.weeklyHours = weeklyHours;
        this.maxModules = maxModules;
    }

    public int getWeeklyHours() { return weeklyHours; }
    public int getMaxModules() { return maxModules; }

    @Override
    public String toString() {
        return super.toString()
                + " | Weekly hours: " + weeklyHours
                + " | Maximum modules: " + maxModules;
    }
}