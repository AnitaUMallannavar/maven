package com.xworkz.jdbcproject.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.xworkz.jdbcproject.util.JDBCUtil;

public class MovieDetails {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Statement statement = null;

		try (Connection connection = DriverManager.getConnection(JDBCUtil.url, JDBCUtil.userName, JDBCUtil.password)) {

			statement = connection.createStatement();

			String query = "insert into MovieDetails values(1,'SitaRam','Mahakavi Theiter',420)";
			int i = statement.executeUpdate(query);
			if (i != 0) {
				System.out.println("Inserted successfully");
			} else {
				System.err.println("not inserted");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		System.out.println("Deleting  data from college detail...");
		try (Connection connection = DriverManager.getConnection(JDBCUtil.url, JDBCUtil.userName, JDBCUtil.password)) {

			statement = connection.createStatement();

			int i = statement.executeUpdate("delete from MovieDetails  where Num=1 ");
			if (i != 0) {
				System.out.println("deleted successfully");
			} else {
				System.err.println("not deleted");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
