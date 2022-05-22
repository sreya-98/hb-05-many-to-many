package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/hb-05-many-to-many?useSSL=false&serverTimezone=UTC";
		String user = "hbstudent";
		String pass = "hbstudent";
		
		try{
			System.out.println("Connecting to Database: " + jdbcUrl);
			Connection myconn = DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Connection Established !!!!");
			
		}
		catch(Exception exc){
			exc.printStackTrace();
		}
	}

}
