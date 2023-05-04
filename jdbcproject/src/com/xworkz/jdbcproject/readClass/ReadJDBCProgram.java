package com.xworkz.jdbcproject.readClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadJDBCProgram {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class is loaded..");

			try {
				Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root",
						"8105932128");
				String querry = "select * from jdbc.icecream";
				Statement st = connect.createStatement();
				ResultSet result = st.executeQuery(querry);
				ResultSet get = st.getResultSet();
				while (result.next()) {
					System.out.println("icName:" + result.getString(1) + "][cost:" + result.getInt(2) + "][Flaver :"
							+ result.getString(3));

				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
