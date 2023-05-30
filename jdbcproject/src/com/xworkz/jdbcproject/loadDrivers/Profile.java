package com.xworkz.jdbcproject.loadDrivers;

import java.sql.Connection;
import java.sql.DriverManager;

public class Profile {

	public static void main(String[] args) {
		try {
			System.out.println("loading Driver class..");
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "8105932128");
			String querry = "insert into Profile1 values('Akash',19,5.11)";
			java.sql.Statement statement = connect.createStatement();
			boolean ble = statement.execute(querry);
			System.out.println("return from database :" + ble);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
