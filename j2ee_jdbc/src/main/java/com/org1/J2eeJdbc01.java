package com.org1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J2eeJdbc01 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		// Step 01 : loading database driver 
		Class.forName("org.postgresql.Driver");
		System.out.println("[_/] Database driver loaded successfully ..!");
		
		// Step 02 : creating connection with database
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp2?user=postgres&password=root");
		System.out.println("[_/] Connection created successfully ..!");
		
		// Step 03 : create statement
		// step 04_01
//		Statement stm=con.createStatement();
//		System.out.println("[_/] Statement using Statement interfce created successfully ..!");
		
		// Step 04_01 : execute query using createStatement
		
//		stm.execute("insert into student values  (101,'Nitin')");
//		System.out.println("[_/] insertion Query executed successfully ..!");

//		stm.execute("update student set id=99 where name='Raj' ");
//		System.out.println("[_/] update Query executed successfully ..!");

//		stm.execute("delete from  student where id=99 ");
//		System.out.println("[_/] delete Query executed successfully ..!");
	
//		PreparedStatement pstm=con.prepareStatement("insert into student values (?,?)");
//		System.out.println("[_/] Statement using preparedstaement interface created successfully ..!");
//		

		
//		System.out.println("[_/] insertion Query executed using preparedStatement-interface successfully ..!");		
//		PreparedStatement pstm2=con.prepareStatement("update student set name=? where id=?");
		PreparedStatement pstm2=con.prepareStatement("delete from  student where  name=?");
		System.out.println("[_/] Statement using preparedstaement interface created successfully ..!");
		
		
//		pstm2.setString(1,"deleteThis");
//		pstm2.setInt(2,999);
		
		
		
//
//		System.out.println("[_/] insertion Query executed using preparedStatement-interface successfully ..!");
		
//		pstm2.setString(1,"deleteThis");
//		System.out.println("[_/] deletion Query executed using preparedStatement-interface successfully ..!");


//		pstm.execute();
		pstm2.execute();
		
		

		System.out.println("query execution completed..!");

		
		
		
	}

	 
}
