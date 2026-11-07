package university;

public class Staff extends User {
    private int weeklyHours;
    private int maxModules;

    public Staff(int id, String firstName, String lastName,
                 String email, String department,
                 int weeklyHours, int maxModules) {

        super(id, firstName, lastName, email, department);

        this.weeklyHours = weeklyHours;
        this.maxModules = maxModules;
    }

    public int getWeeklyHours() {
        return weeklyHours;
    }

    public int getMaxModules() {
        return maxModules;
    }

    @Override
    public String getRole() {
        return "Staff";
    }
}