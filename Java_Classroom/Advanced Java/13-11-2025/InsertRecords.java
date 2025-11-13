//13-11-2025
package com.codegnan.jdbcprograms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecords {
	static final String jdbc_url="jdbc:mysql://localhost:3306/jfs41";
	static final String userName="root";
	static final String password="root";

	public static void main(String[] args) {
		//try with resources
		try(Connection connection=
				DriverManager.getConnection(jdbc_url,userName,password);
				Statement statement=connection.createStatement()) {
			
			
			Scanner sc=new Scanner(System.in);
			//insert
//			String insertSql="insert into employee(eno,ename,esal,eaddr) values"
//					+"(111,'emp_name',70000.0,'hyd')";
//			int rowsAffected=statement.executeUpdate(insertSql);
			//insert user input
			///*
			System.out.println("Enter no. of employee records to insert: ");
			int numRecords=sc.nextInt();
			for(int i=0;i<numRecords;i++) {
				System.out.println("Enter details for record "+(i+1)+": ");
			
			System.out.println("Enter employee number: ");
			int num=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter employee name: ");
			String name=sc.nextLine();
			System.out.println("Enter employee salary: ");
			double salary=sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter employee address: ");
			String address=sc.nextLine();
			String insertSql="insert into employee(eno,ename,esal,eaddr) values("
							+num+",'"
							+name+"',"
							+salary+",'"
							+address+"')";
			int rowsAffected=statement.executeUpdate(insertSql);
			//*/
			
			//update
//			String updateQuery="update employee set ename='ananya',esal=750000,eaddr='chennai' where eno=111";
			//update multiple records
			/*
			 
			System.out.println("Enter no.of employee records to update: ");
			int numRecords=sc.nextInt();
			for(int i=0;i<numRecords;i++) {
				System.out.println("Enter details for "+(i+1)+" record update : ");
			
				System.out.println("Enter employee number: ");
				int eno=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter employee name: ");
				String name=sc.nextLine();
				System.out.println("Enter employee salary: ");
				double salary=sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter employee address: ");
				String address=sc.nextLine();
				String updateQuery="update employee set "
								+"ename='"+name+"',"
								+"esal="+salary+","
								+"eaddr='"+address+"' "
								+"where eno="+eno;
				int rowsAffected=statement.executeUpdate(updateQuery);
			*/
			
			//update records based on salary increment (bonus for salary>=50k)
					/*
					System.out.println("Enter employee bonus: ");
					int bonus=sc.nextInt();
					
					String updateQuery="update employee set esal=esal+"+bonus+" where esal>=50000";
					int rowsAffected=statement.executeUpdate(updateQuery);
					*/
			
			//delete
//				String deleteQuery="delete from employee where eno=111";
//				int rowsAffected=statement.executeUpdate(updateQuery);
//				int rowsAffected=statement.executeUpdate(deleteQuery);
					
			//delete multiple records
				/*
				System.out.println("Enter no.of employee records to delete: ");
				int numRecords=sc.nextInt();
				for(int i=0;i<numRecords;i++) {
					System.out.println("Enter employee number you want to delete: ");
					int eno=sc.nextInt();
					String deleteQuery="delete from employee where eno="+eno;
					int rowsAffected=statement.executeUpdate(deleteQuery);
				*/
			
			//delete records where sal<60k
			/*
				String deleteQuery="delete from employee where esal<70000";
				int rowsAffected=statement.executeUpdate(deleteQuery);
			
				
				
				if(rowsAffected>0) {
//					System.out.println("record inserted successfully");
					System.out.println("record updated successfully");
//					System.out.println("record deleted successfully");
				} else {
//					System.out.println("failed to insert record");
			 	   	System.out.println("failed to update record");	
//					System.out.println("failed to delete record");
				}
				*/
			
			
			}
			
			} catch(SQLException e) {
				e.printStackTrace();
			}

	}

}
//✅update single record
//✅update multiple recs
//✅delete single recs
//✅del mul recs
//✅delete wher sal<70k
//✅update particular no of rows
//✅update where sal>=50k