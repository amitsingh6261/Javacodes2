package com.sait.ps;

import java.sql.*;


public class InsertData {

	public static void main(String[] args) {
		try {
			Connection c=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sait",
					"root","12345");
			PreparedStatement ps=c.prepareStatement(
					"insert into student(name,phone)values(?,?)");
			ps.setString(1, "ram");
			ps.setString(2, "556774884");
			ps.executeUpdate();
			System.out.println("Data Inserted!!");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
