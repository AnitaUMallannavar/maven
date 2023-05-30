package com.xworkz.jdbcproject.loadDrivers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Movie {

	public static void main(String[] args) {
		try {
			System.out.println("loading Driver  cls...");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "8105932128");
			String querry = "insert into Movie values('Milana','Punith Rajkumar')";
			Statement statement = connect.createStatement();
			boolean value = statement.execute(querry);
			System.out.println(value);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
