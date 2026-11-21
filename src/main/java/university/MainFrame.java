package main.java.university;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import main.java.university.Globals.Role;

public class MainFrame extends JFrame {
        JPanel navPanel, contentPanel, footerPanel;
        JButton homeButton, coursesButton, studentsButton, staffButton;
        JLabel label;
        JTextField input;
        // Because student extends user, I add field user
        private ArrayList<User> users;

    public MainFrame(ArrayList<User> users) {
        this.users = users;

        this.setSize(600, 600);
        this.setLayout(new BorderLayout());

        // Navbar
        navPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 50, 20));
        navPanel.setBackground(Color.BLACK);
        navPanel.setSize(600, 100);

        // Navbar buttons
        homeButton = new JButton("Home");
        coursesButton = new JButton("Courses");
        studentsButton = new JButton("Students");
        staffButton = new JButton("Staff");

        // Telling the button what to do
        studentsButton.addActionListener(
                e -> showUsers(Role.STUDENT)
        );

        staffButton.addActionListener(
                e -> showUsers(Role.STAFF)
        );

        // ADD Navbar
        this.add(navPanel, BorderLayout.NORTH);
        navPanel.add(homeButton);
        navPanel.add(studentsButton);
        navPanel.add(coursesButton);
        navPanel.add(staffButton);


        // Content
        contentPanel = new JPanel();
        contentPanel.setBackground(Color.GRAY);

        // ADD Content SCROLLABLE
        this.add(new JScrollPane(contentPanel), BorderLayout.CENTER);


        // Footer
        footerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 50, 20));
        footerPanel.setBackground(Color.BLACK);

        // ADD Footer
        this.add(footerPanel, BorderLayout.SOUTH);


        // secondPanel = new JPanel();
        // secondPanel.setBackground(Color.PINK);
        // secondPanel.setSize(600, 100);

    
        // JList<String> studentsList;
        // String[] studentNames = {
        // "Ravi Linge",
        // "Hamid Felderer",
        // "Concordia Burris"
        // };

        // studentsList = new JList<>(studentNames);



        // input = new JTextField(20);


        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

// Show students when the window first opens.
        showUsers(Role.STUDENT);
    }

    private void showUsers(Role roleToShow) {

        // Remove the previous screen's components.
        contentPanel.removeAll();

        // Display one user panel per row.
        contentPanel.setLayout(new GridLayout(0, 1, 10, 10));

        int numberShown = 0;

        // Look through every imported user.
        for (User user : users) {

            // Display only users matching the requested role.
            if (user.getRole() == roleToShow) {

                // Keep this person's details together.
                JPanel userPanel = new JPanel(
                        new GridLayout(0, 1)
                );

                userPanel.setBorder(
                        BorderFactory.createEmptyBorder(10, 10, 10, 10)
                );

                userPanel.add(
                        new JLabel("Name: " + user.getFullName())
                );

                userPanel.add(
                        new JLabel("ID: " + user.getId())
                );

                userPanel.add(
                        new JLabel("Email: " + user.getEmail())
                );

                userPanel.add(
                        new JLabel("Role: " + user.getRole())
                );

                contentPanel.add(userPanel);

                numberShown++;
            }
        }

        if (numberShown == 0) {
            contentPanel.add(
                    new JLabel("No users found for role: " + roleToShow)
            );
        }

        // Recalculate the layout and redraw the content.
        contentPanel.revalidate();
        contentPanel.repaint();
    }
    
}
