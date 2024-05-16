package controller;

import java.sql.SQLException;

import service.Service;

public class Controller {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Service ss=new Service();
		ss.m1();
		return;
	}
}
