package com.xworkz.jdbcproject.loadDrivers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCProgram {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.cj.Driver");

		//	Connection cannect = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "8105932128");
		//	String querry = "insert into IceCream('Arun',70,'ButterSrotch')";
		//	Statement statement = cannect.createStatement();
		//	boolean bl = statement.execute(querry);
		//	System.out.println("return from database :" + bl);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
