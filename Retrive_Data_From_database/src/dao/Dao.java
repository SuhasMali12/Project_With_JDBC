package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.Student;

public class Dao {

	public void addStudent(Student s1) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");
		PreparedStatement pstmt = con.prepareStatement("INSERT INTO Student (student_id, student_name, age, grade) VALUES (?, ?, ?, ?)");

		pstmt.setString(1, s1.getStudent_id());
		pstmt.setString(2, s1.getStudent_name());
		pstmt.setString(3, s1.getAge());
		pstmt.setString(4, s1.getGrade());

		pstmt.executeUpdate();
		System.out.println("Data Saved....!");
	}
}
