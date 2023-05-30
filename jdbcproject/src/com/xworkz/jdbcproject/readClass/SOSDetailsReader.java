package com.xworkz.jdbcproject.readClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SOSDetailsReader {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "8105932128");
			String querry = "select * from jdbc.OSDetails";
			Statement state = connect.createStatement();
			ResultSet result = state.executeQuery(querry);
			ResultSet get = state.getResultSet();
			while (result.next()) {
				System.out.println("OSName:" + result.getString(1));
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}