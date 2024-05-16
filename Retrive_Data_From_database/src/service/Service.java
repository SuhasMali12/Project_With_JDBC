package service;

import java.sql.SQLException;

import dao.Dao;
import entity.Student;

public class Service {

	public void addStudent(Student s1) throws ClassNotFoundException, SQLException {

		Dao d1 = new Dao();

		d1.addStudent(s1);

	}
}
