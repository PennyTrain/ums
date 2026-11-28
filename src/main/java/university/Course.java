package main.java.university;

public class Course {
    private String code, name, department;

    public Course(String code, String name, String department) {
        this.code = code;
        this.name = name;
        this.department = department;
    }

    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
}
