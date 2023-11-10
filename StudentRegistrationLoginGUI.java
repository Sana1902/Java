import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRegistrationLoginGUI extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private Connection dbConnection;

    public StudentRegistrationLoginGUI() {
        super("Student Registration and Login");

        // Initialize database connection
        try {
            dbConnection = DriverManager.getConnection("jdbc:mysql://localhost/studentdb", "your_username", "your_password");
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        }

        // Create GUI components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);
        JButton registerButton = new JButton("Register");
        JButton loginButton = new JButton("Login");

        // Add components to the panel
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(registerButton);
        panel.add(loginButton);

        // Register button action
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerUser();
            }
        });

        // Login button action
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginUser();
            }
        });

        // Add the panel to the frame
        add(panel);

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void registerUser() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        try {
            String insertQuery = "INSERT INTO students (username, password) VALUES (?, ?)";
            PreparedStatement preparedStatement = dbConnection.prepareStatement(insertQuery);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(this, "Registration successful");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Registration failed");
        }
    }

    private void loginUser() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        try {
            String selectQuery = "SELECT * FROM students WHERE username = ? AND password = ?";
            PreparedStatement preparedStatement = dbConnection.prepareStatement(selectQuery);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                JOptionPane.showMessageDialog(this, "Login successful");
            } else {
                JOptionPane.showMessageDialog(this, "Login failed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Login failed");
        }
    }

    public static void main(String[] args) {
        // Register the MySQL driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StudentRegistrationLoginGUI();
            }
        });
    }
}
