import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
create database ems;
use ems;
create table employee (
  id int primary key,
  name varchar(25),
  gender varchar(10),
  phoneNum varchar(13),
  email varchar(25),
  designation varchar(20),
  salary double
);
create table admin (
  username varchar(25) primary key,
  password varchar(25)
);
// gets the required driver
Classimport java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

public class EmployeeManagementSystem {
    private static ArrayList<Employee> employees = new ArrayList<>();
    private static int currentId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Employee Management System Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addEmployee(scanner);
                    break;
                case 2:
                    viewEmployees();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addEmployee(Scanner scanner) {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(currentId, name, salary);
        employees.add(employee);

        System.out.println("Employee added with ID: " + currentId);
        currentId++;
    }

    private static void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }

        System.out.println("Employee List:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
("com.mysql.cj.jdbc.Driver");
// creates connection with sql
String dbName = "ems";
String db_username = "root";
String db_password = "master";
Connection con= DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/"+dbName, db_username, db_password);
EmployeeManagementSystem ems = new EmployeeManagementSystem(con);
ems.loginFrame = new JFrame();

JLabel usernameLabel = new JLabel("Username");
usernameLabel.setBounds(200,150,220,50);
usernameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
ems.loginFrame.add(usernameLabel);

JTextField usernameField = new JTextField();
usernameField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
usernameField.setBounds(450,150,420,50);
ems.loginFrame.add(usernameField);

JLabel passwordLabel = new JLabel("Password");
passwordLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
passwordLabel.setBounds(200,250,220,50);
ems.loginFrame.add(passwordLabel);

JPasswordField passwordField = new JPasswordField();
passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
passwordField.setBounds(450,250,420,50);
ems.loginFrame.add(passwordField);

JButton submitButton=new JButton("Submit");
submitButton.setFont(new Font("Times New Roman", Font.PLAIN, 30));
submitButton.setBounds(450,400,250, 50);
ems.loginFrame.add(submitButton);

ems.loginFrame.setSize(1100,750);
ems.loginFrame.setLayout(null);
ems.loginFrame.setVisible(true);
ems.loginFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);