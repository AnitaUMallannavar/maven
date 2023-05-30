package com.xworkz.jdbcproject.readClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MovieReader {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "8105932128");
			String querry = "select * from jdbc.Movie";
			Statement state = connect.createStatement();
			ResultSet result = state.executeQuery(querry);
			ResultSet get = state.getResultSet();
			while (result.next()) {
				System.out.println("MovieName:" + result.getString(1) + " "+ "][Hero:"
						+ result.getString(2));
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
