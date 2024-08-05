package controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import service.Service;
import entity.Student;

public class Controller {

    private Service service;

    // Constructor to initialize the service
    public Controller() {
        service = new Service();
    }

    // Method to handle creating a new student
    public void createStudent() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        String id = sc.nextLine();
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter student age: ");
        String age = sc.nextLine();
        System.out.print("Enter student grade: ");
        String grade = sc.nextLine();

        Student student = new Student();
        student.setStudent_id(id);
        student.setStudent_name(name);
        student.setAge(age);
        student.setGrade(grade);

        service.createStudent(student);
        System.out.println("Student created successfully.");
    }

    // Method to handle listing all students
    public void listStudents() throws SQLException {
        List<Student> students = service.getAllStudents();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Method to handle updating a student
    public void updateStudent() throws SQLException {
        Scanner sca = new Scanner(System.in);
        System.out.print("Enter student ID to update: ");
        String id = sca.nextLine();
        System.out.print("Enter new student name: ");
        String name = sca.nextLine();
        System.out.print("Enter new student age: ");
        String age = sca.nextLine();
        System.out.print("Enter new student grade: ");
        String grade = sca.nextLine();

        Student student = new Student();
        student.setStudent_id(id);
        student.setStudent_name(name);
        student.setAge(age);
        student.setGrade(grade);

        service.updateStudent(student);
        System.out.println("Student updated successfully.");
    }

    // Method to handle deleting a student
    public void deleteStudent() throws SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student ID to delete: ");
        String id = scan.nextLine();

        service.deleteStudent(id);
        System.out.println("Student deleted successfully.");
    }

    // Method to display a menu and handle user input
    public void run() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("1. Create Student");
            System.out.println("2. List Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scan.nextInt();
            scan.nextLine(); // Consume newline

            try {
                switch (choice) {
                    case 1:
                        createStudent();
                        break;
                    case 2:
                        listStudents();
                        break;
                    case 3:
                        updateStudent();
                        break;
                    case 4:
                        deleteStudent();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("An error occurred. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.run();
    }
}
