package main.java.university;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) throws IOException {

        // Load the JSON and receive the list returned by loadUsers().
        ArrayList<User> users = ImportJson.loadUsers();

        // Create and display the interface on Swing's UI thread.
        SwingUtilities.invokeLater(() -> {

            // Pass the imported list into the window.
            MainFrame frame = new MainFrame(users);

            frame.setVisible(true);
        });
    }
}