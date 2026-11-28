package main.java.university;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import main.java.university.Globals.Role;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class ImportJson {

    // Main will call this method to get the imported users.
    public static ArrayList<User> loadUsers() throws IOException {
        String json = Files.readString(
                Path.of("src/resources/data/users.json")
        );
        Gson gson = new Gson();
        JsonArray jsonUsers = JsonParser.parseString(json)
                .getAsJsonArray();
        ArrayList<User> users = new ArrayList<>();
        for (JsonElement element : jsonUsers) {
            String roleText = element.getAsJsonObject()
                    .get("role")
                    .getAsString();
            Role role = Role.valueOf(roleText);
            User user = switch (role) {
                case STUDENT -> gson.fromJson(element, Student.class);
                case STAFF -> gson.fromJson(element, Staff.class);
                case ADMIN -> gson.fromJson(element, Admin.class);
            };
            users.add(user);
        }
        // Give the completed list back to whichever code called us.
        return users;
    }

    // Main will call this method to get the imported courses.
    public static ArrayList<Course> loadCourses() throws IOException {

        String json = Files.readString(
                Path.of("src/resources/data/courses.json")
        );

        Gson gson = new Gson();

        // Read the JSON array containing the courses.
        JsonArray jsonCourses = JsonParser.parseString(json)
                .getAsJsonArray();

        // Create the list that will hold our Course objects.
        ArrayList<Course> courses = new ArrayList<>();

        // Convert each JSON record into a Course object.
        for (JsonElement element : jsonCourses) {

            Course course = gson.fromJson(element, Course.class);

            courses.add(course);
        }

        return courses;
    }
}