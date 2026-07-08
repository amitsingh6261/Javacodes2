package com.sait.statement;
import java.sql.*;

import java.sql.DriverManager;

public class CreateTable {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sait",
					"root","12345");
			Statement st=c.createStatement();
			st.executeUpdate("create table student("
					+"id int primary key auto_increment,"
					+"name varchar(50),"
					+"phone varchar(10))");
			System.out.println("Table create successfully");

		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
