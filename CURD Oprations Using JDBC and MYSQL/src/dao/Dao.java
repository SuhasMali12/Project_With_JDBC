package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Student;

public class Dao {

    private static final String URL = "jdbc:mysql://localhost:3306/students";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // Establishes a connection to the database
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Method to create (insert) a new student
    public void createStudent(Student student) throws SQLException {
        String sql = "INSERT INTO Student (student_id, student_name, age, grade) VALUES (?, ?, ?, ?)";
        try (Connection con = getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, student.getStudent_id());
            pstmt.setString(2, student.getStudent_name());
            pstmt.setString(3, student.getAge());
            pstmt.setString(4, student.getGrade());
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " record(s) inserted.");
        }
    }

    // Method to read (select) all students
    public List<Student> getAllStudents() throws SQLException {
        String sql = "SELECT * FROM Student";
        List<Student> students = new ArrayList<>();
        try (Connection con = getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Student student = new Student();
                student.setStudent_id(rs.getString("student_id"));
                student.setStudent_name(rs.getString("student_name"));
                student.setAge(rs.getString("age"));
                student.setGrade(rs.getString("grade"));
                students.add(student);
            }
        }
        return students;
    }

    // Method to update an existing student
    public void updateStudent(Student student) throws SQLException {
        String sql = "UPDATE Student SET student_name = ?, age = ?, grade = ? WHERE student_id = ?";
        try (Connection con = getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, student.getStudent_name());
            pstmt.setString(2, student.getAge());
            pstmt.setString(3, student.getGrade());
            pstmt.setString(4, student.getStudent_id());
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " record(s) updated.");
        }
    }

    // Method to delete a student by ID
    public void deleteStudent(String studentId) throws SQLException {
        String sql = "DELETE FROM Student WHERE student_id = ?";
        try (Connection con = getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, studentId);
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " record(s) deleted.");
        }
    }

}
