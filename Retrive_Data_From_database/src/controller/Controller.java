package controller;

import java.sql.SQLException;
import java.util.Scanner;

import entity.Student;
import service.Service;

public class Controller {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       
        /*Student s1= new Student();
        s1.setStudent_id("3");
        s1.s+etStudent_name("Suhas");
        s1.setAge("30");
        s1.setGrade("A+");

        Service ss = new Service();
        ss.addStudent(s1);
    }
}
            For USER INPUT*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student ID:");
        String studentId = scanner.nextLine();

        System.out.println("Enter student name:");
        String studentName = scanner.nextLine();

        System.out.println("Enter student age:");
        String age = scanner.nextLine();

        System.out.println("Enter student grade:");
        String grade = scanner.nextLine();

        Student s1 = new Student();
        s1.setStudent_id(studentId);
        s1.setStudent_name(studentName);
        s1.setAge(age);
        s1.setGrade(grade);

        Service ss = new Service();
        ss.addStudent(s1);

        scanner.close();
    }
}
