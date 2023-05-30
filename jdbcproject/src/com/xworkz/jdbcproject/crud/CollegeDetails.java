package com.xworkz.jdbcproject.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.xworkz.jdbcproject.util.JDBCUtil;

public class CollegeDetails {

	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Statement statement = null;

		try (Connection connection = DriverManager.getConnection(JDBCUtil.url, JDBCUtil.userName, JDBCUtil.password)) {

			statement = connection.createStatement();

			String query = "insert into CollegeDetails values('Tungal College',3000,'Jamakhandi',420,'S16602')";
			int i = statement.executeUpdate(query);
			if (i != 0) {
				System.out.println("Inserted successfully");
			} else {
				System.err.println("not inserted");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		/*System.out.println("Updating data in college detail...");
		try (Connection connection = DriverManager.getConnection(JDBCUtil.url, JDBCUtil.userName, JDBCUtil.password)) {

			statement = connection.createStatement();

			int i = statement.executeUpdate(
					"update CollegeDetails set Cname='Tungal Basic & applied Science College JKD' where collegeCode='S16602' ");
			if (i != 0) {
				System.out.println("updated successfully");
			} else {
				System.err.println("not updated");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		System.out.println("Deleting  data from college detail...");
		try (Connection connection = DriverManager.getConnection(JDBCUtil.url, JDBCUtil.userName, JDBCUtil.password)) {

			statement = connection.createStatement();

			int i = statement.executeUpdate(
					"delete from CollegeDetails  where collegeCode='S16602' ");
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
