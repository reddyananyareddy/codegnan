//13-11-2025
package com.codegnan.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RetrieveRecords {
	static final String jdbc_url="jdbc:mysql://localhost:3306/jfs41";
	static final String userName="root";
	static final String password="root";

	public static void main(String[] args) {
		
		try(Connection connection=
				DriverManager.getConnection(jdbc_url,userName,password);
				Statement statement=connection.createStatement()) {
//			Scanner sc=new Scanner(System.in);
//			System.out.println("Enter employee number to retrieve record");
//			int num=sc.nextInt();
//			String selectQuery="select * from employee where eno="+num;
			String selectQuery="select * from employee";
			ResultSet rs=statement.executeQuery(selectQuery);
			System.out.println("eno===>ename--->esal===>eaddr");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"===>"+rs.getString(2)+"--->"+rs.getDouble(3)+"===>"+rs.getString(4));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
