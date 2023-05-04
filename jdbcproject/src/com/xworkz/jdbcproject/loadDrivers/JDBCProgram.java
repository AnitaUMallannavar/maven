package com.xworkz.jdbcproject.loadDrivers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCProgram {
	public static void main(String[] args) {
		try {
			System.out.println("Driver class is loaded");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cannect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "8105932128");
			System.out.println(cannect);
			String querry = "insert into IceCream values('Arun',70,'ButterSrotch')";
			Statement statement = cannect.createStatement(); 
			boolean bl = statement.execute(querry);
			System.out.println("return from database :" + bl);		 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
