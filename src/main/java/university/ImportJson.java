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
    // Shared by the importing methods.
    private static final Gson GSON = new Gson();
    // Read any JSON file whose top-level structure is an array.
    private static JsonArray readJsonArray(String filePath)
            throws IOException {
        String json = Files.readString(Path.of(filePath));
        return JsonParser.parseString(json).getAsJsonArray();
    }

    public static ArrayList<User> loadUsers() throws IOException {
        JsonArray jsonUsers = readJsonArray("src/resources/data/users.json");
        ArrayList<User> users = new ArrayList<>();
        for (JsonElement element : jsonUsers) {
            Role role = Role.valueOf(
                    element.getAsJsonObject()
                            .get("role")
                            .getAsString()
            );
            // Select the concrete subclass for this user's role.
            // this enables the button filtering
            User user = switch (role) {
                case STUDENT -> GSON.fromJson(element, Student.class);
                case STAFF -> GSON.fromJson(element, Staff.class);
                case ADMIN -> GSON.fromJson(element, Admin.class);
            };
            users.add(user);
        }
        return users;
    }

    public static ArrayList<Course> loadCourses() throws IOException {
        JsonArray jsonCourses = readJsonArray("src/resources/data/courses.json");
        ArrayList<Course> courses = new ArrayList<>();
        for (JsonElement element : jsonCourses) {
            courses.add(GSON.fromJson(element, Course.class));
        }
        return courses;
    }

    public static ArrayList<Module> loadModules() throws IOException {
        JsonArray jsonModules = readJsonArray("src/resources/data/modules.json");
        ArrayList<Module> modules = new ArrayList<>();
        for (JsonElement element : jsonModules) {
            modules.add(GSON.fromJson(element, Module.class));
        }
        return modules;
    }
}