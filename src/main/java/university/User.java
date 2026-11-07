package university;

public abstract class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    // Everyone at the University should have "Department"
    private String department;

    public User(int id, String firstName, String lastName,
                String email, String department) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
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

    // Makes this easy if it is defined in the other classes
    public abstract String getRole();
}