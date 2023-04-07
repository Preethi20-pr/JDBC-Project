package com.JDBCsample;

//importing package
import java.sql.*;

/**
* JDBC sample program 
*
*/
public class App 
{
  public static void main( String[] args ) throws Exception
  {
      
  	//load and register driver
  	Class.forName("com.mysql.cj.jdbc.Driver");
  	//create the object to get connection
  	//URL to DB,username,password
  	String url="jdbc:mysql://localhost:3306/hostel";
  	String username="root";
  	String password="72041999";
  	 
  	//connection to db
     Connection sp=DriverManager.getConnection(url,username,password);
  	// statement to execute a query 
  	Statement st=sp.createStatement();
  	// execution of query and storing the response in result set rs
  	ResultSet rs=st.executeQuery("select * from student");
  	//checking the response
  	while(rs.next())
  	{
  		String studentdata=rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3);
  	//reading the name from response
  		 System.out.println(studentdata);
  		 
  		 
  	}
     //closing connection
  	 sp.close();
  	 
  	 
  }
}
