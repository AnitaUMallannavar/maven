package com.xworkz.jdbcproject.loadDrivers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class LaptopDetails {

	public static void main(String[] args) {

		try {
			System.out.println("Driver class is loaded...");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "8105932128");
			//System.out.println(connect);
			String querry = "INSERT INTO LaptopDetails values('HP',48000,'128Ram')";
			Statement statement = connect.createStatement();
			boolean ble = statement.execute(querry);
			System.out.println("return from database :" + ble);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
