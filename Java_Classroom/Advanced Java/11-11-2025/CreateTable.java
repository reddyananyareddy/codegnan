//11-11-2025
package com.codegnan.jdbcprograms;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;



public class CreateTable {
	
	static final String jdbc_url="jdbc:mysql://localhost:3306/jfs41";
	static final String userName="root";
	static final String password="root";
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try {
			//step-1: load and register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step-2: establish connection
			con=DriverManager.getConnection(jdbc_url,userName,password);
			//step-3: create statement
			st=con.createStatement();
			//step-4: prepare and execute sql query
			String sqlQuery="create table if not exists employee("
					+"eno int auto_increment primary key,"
					+"ename varchar(100),"
					+"esal decimal(10,2),"
					+"eaddr varchar(100)" + ")";
			st.execute(sqlQuery);
			System.out.println("Employee table created successfully");
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(con!=null) {
				try {
					con.close();				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	    }
		
	}
}
