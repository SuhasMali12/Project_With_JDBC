package service;

import java.sql.SQLException;
import java.util.List;
import dao.Dao;
import entity.Student;

public class Service {

    private Dao dao;

    // Constructor to initialize the DAO
    public Service() {
        dao = new Dao();
    }

    // Method to create a new student
    public void createStudent(Student student) throws SQLException {
        dao.createStudent(student);
    }

    // Method to get all students
    public List<Student> getAllStudents() throws SQLException {
        return dao.getAllStudents();
    }

    // Method to update an existing student
    public void updateStudent(Student student) throws SQLException {
        dao.updateStudent(student);
    }

    // Method to delete a student by ID
    public void deleteStudent(String studentId) throws SQLException {
        dao.deleteStudent(studentId);
    }
}

