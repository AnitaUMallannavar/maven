package com.xworkz.jdbcproject.loadDrivers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SoftwareDetails {

	public static void main(String[] args) {
		try {
			System.out.println("loading driver cls..");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","8105932128");
			String querry="insert into SoftwareDetails values('Infosys','Bangalor') ";
			Statement statement= connect.createStatement();
			boolean bl= statement.execute(querry);
			System.out.println(bl);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
