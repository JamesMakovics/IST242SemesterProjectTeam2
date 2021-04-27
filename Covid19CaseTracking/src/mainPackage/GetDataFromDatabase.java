package mainPackage;

/*Name: James Makovics
 * Date: 4/26/2021
 * Professor: Professor Middaugh
 */
import java.io.*;
import java.sql.*;
import java.util.*;

public class getDataFromDatabase{ 
	int NumberofCases;
	int Recovery;
	int Deathes;
	int Vaccinations;
	
	public void getCountry(String countryName1)
throws SQLException, ClassNotFoundException {

String countryName = countryName1;	

// Load the JDBC driver
Class.forName("com.mysql.jdbc.Driver");
System.out.println("Driver loaded");

// Establish a connection
Connection connection = DriverManager.getConnection
("jdbc:mysql://localhost/mydb","root","");
//("jdbc:mysql://localhost/DATABASE","USERNAME","PASSWORD");
System.out.println("Database connected");
// Create a statement
Statement statement = connection.createStatement();

// Execute a statement


ResultSet resultSet = statement.executeQuery
("select * from Countries where  = " + countryName );
// Iterate through the result and print the student names
while (resultSet.next())
{
	//This next line is showing columns in my table, here we have 6 column
   NumberofCases = resultSet.getInt(2);
   Recovery = resultSet.getInt(3);
   Deathes = resultSet.getInt(4);
   Vaccinations = resultSet.getInt(5);
   
   //return (NumberofCases, Recovery, Deathes, Vaccinations);
   
}
// Close the connection
connection.close();


}

public int getNumberofCases(){
	return NumberofCases;
}

public int getRecovery() {
	return Recovery;
}

public int getDeathes () {
	return Deathes;
}

public int getVaccinations() {
	return Vaccinations;
}

}