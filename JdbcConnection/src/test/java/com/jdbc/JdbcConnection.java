package com.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {

public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	Connection con =  null;
	Statement stmt = null;
	ResultSet resultset = null;
	
	try {
	
	Class.forName("oracle.jdbc.driver.OracleDriver");

	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");

	String sql = "select * from employees";
	
	stmt = con.createStatement();

	resultset = stmt.executeQuery(sql);
	
	while(resultset.next()) {
	System.out.println("datass "+resultset.getString(1)+" "+resultset.getString(2)+" "+resultset.getString(3)+" "+resultset.getString(4)+" "+resultset.getString(5)+" "+resultset.getString(6)+" "+resultset.getString(7));

	
	}
	
	
	
	
	
	}
	
	catch(Exception e) {
		
		System.err.println(e);
	}
}
}
