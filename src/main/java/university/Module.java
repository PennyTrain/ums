package main.java.university;

import com.google.gson.annotations.SerializedName;

public class Module {
    private String name, code;
    @SerializedName("ac_year")
    private String academicYear;

    public Module(String name, String code, String academicYear) {
        this.name = name;
        this.code = code;
        this.academicYear = academicYear;
    }
    public String getName() { return name; }
    public String getCode() { return code; }
    public String getAcademicYear() { return academicYear; }
}