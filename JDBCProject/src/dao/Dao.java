package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Student;

public class Dao {
	
public void m1()throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
	    Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from Student");
		List<Student> list=new ArrayList<Student>();
		while(rs.next()) {
			String id=rs.getString(1);
			String sn=rs.getString(2);
			String sa=rs.getString(3);
			String sg=rs.getString(4);
			Student st=new Student();
			st.setStudent_id(id);
			st.setStudent_name(sn);
			st.setAge(sa);
			st.setGrade(sg);
			list.add(st);
			}
	
		for (Student student : list) {
			System.out.println(student);
			}
		    }
}
