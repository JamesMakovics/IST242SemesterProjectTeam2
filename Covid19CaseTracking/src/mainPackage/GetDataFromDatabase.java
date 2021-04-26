package mainPackage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetDataFromDatabase {
	Connection connection;
}


public GetDataFromDatabase() throws SQLException, ClassNotFoundException{
	// Load the JDBC driver
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Driver loaded");
	// Establish a connection
	connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "SBA2018");
	System.out.println("Database connected");
}

public void closeConnection() throws SQLException
{
	// Close the connection
	connection.close();		
}