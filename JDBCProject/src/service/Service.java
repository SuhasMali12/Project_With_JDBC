package service;

import java.sql.SQLException;

import dao.Dao;

public class Service {
	
	public void m1() throws ClassNotFoundException, SQLException {
		Dao dd=new Dao();
		dd.m1();
		return;
	}

}
