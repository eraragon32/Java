package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class databaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	String username="system";
	String password="Oracle12345";
	String url="jdbc:oracle:thin:@localhost:1521:xe";

	Connection con= DriverManager.getConnection(url, username, password);
	if(con!=null) {
   System.out.println("Connection Established");
	}

	Statement st=con.createStatement();
	int x=st.executeUpdate("Insert Into Student VALUES(52,'Ravi','EEE', 59)");
	if(x!=0)
	{
		System.out.println("Record inserted");
	}
		  
		
		int y=st.executeUpdate("UPDATE student SET STUDENTROLL=22 WHERE STUDENTID=52");
		if(y!=0)
		  {
			System.out.println("Record updated");
		  }
		
		int z=st.executeUpdate("DELETE FROM student WHERE STUDENTID=52");
		if(z!=0)
		  {
			System.out.println("record deleted");
		  }
		con.close();
	}

}