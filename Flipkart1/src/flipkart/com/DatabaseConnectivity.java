package flipkart.com;

import java.sql.Connection;

import java.sql.DriverManager;

//import java.sql.ResultSet;

//import java.sql.Statement;




public class DatabaseConnectivity {


	public static Connection con;

	public static Connection getsqlConnection() {
		try {

			
			Class.forName("oracle.jdbc.driver.OracleDriver");  

			          con=DriverManager.getConnection(  

					"jdbc:oracle:thin:@localhost:1521:xe","system","orcl11g"); 

			

			

		  

		}

		catch(Exception e) {

			System.out.println(e);

		}
		return con;
		
	
	
		}



}