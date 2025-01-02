package com.pms.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtility {
	
	public static Connection con = null;
	
	public static Connection getConnection() {
		try {
			//Load the database driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Establish the connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/charan", "root", "root");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}
