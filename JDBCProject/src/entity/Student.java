package entity;

public class Student {
	
	private String student_id;
	private String student_name;
	private String age;
	private String grade;
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", age=" + age + ", grade="
				+ grade + "]";
	}
	}
/*Certainly! The Student class in the provided code is a simple Java class used to represent student entities. 
Let's break down its components and functionalities:
Instance Variables (Fields)-

student_id: A string variable representing the unique identifier of the student.

student_name: A string variable representing the name of the student.

age: A string variable representing the age of the student.

grade: A string variable representing the grade of the student.

Getters and Setters:Each instance variable has a corresponding pair of getter and setter methods. These methods allow other classes to access and modify the values of the instance variables.
The getter methods (getStudent_id(), getStudent_name(), getAge(), getGrade()) return the values of the respective instance variables.
The setter methods (setStudent_id(), setStudent_name(), setAge(), setGrade()) set the values of the respective instance variables.

toString() Method:The toString() method is overridden to provide a string representation of the Student object.
It returns a string containing the values of all instance variables, formatted for easy readability.
This method is often used for debugging purposes and to display object information in logs or user interfaces.
*/