package university;
import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
        JPanel navPanel, contentPanel, footerPanel;
        JButton homeButton, coursesButton, studentsButton;
        JLabel label;
        JTextField input;

    public MainFrame() throws HeadlessException {
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

        // ADD Navbar
        this.add(navPanel, BorderLayout.NORTH);
        navPanel.add(homeButton);
        navPanel.add(studentsButton);
        navPanel.add(coursesButton);


        // Content
        contentPanel = new JPanel();
        contentPanel.setBackground(Color.GRAY);

        // ADD Content
        this.add(contentPanel, BorderLayout.CENTER);


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


        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
}
