package com.org2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Resultset 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		 Class.forName("org.postgresql.Driver");
		 
		 Connection con =DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp2?user=postgres&password=root");
		 
		 Statement stm=con.createStatement();
		 stm.execute("select * from student");
		 
		 ResultSet rs=stm.getResultSet();
		 
		 while(rs.next()) 
		 {
			 System.out.println("id : "+rs.getInt("id")+" name : "+rs.getString("name"));
		 }
		 
	}

}
