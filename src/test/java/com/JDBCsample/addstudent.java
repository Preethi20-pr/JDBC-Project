package com.JDBCsample;

import java.sql.*;

public class addstudent {

	public static void main(String[] args)throws Exception {
		
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
	  	String url="jdbc:mysql://localhost:3306/hostel";
	  	String username="root";
	  	String password="72041999";
	   Connection sp=DriverManager.getConnection(url,username,password);
	   int sid=4;
	   String sname="Reddy";
	   String smobile="8789843544";
	    String query="insert into student values(?,?,?)";
	    PreparedStatement pst= sp.prepareStatement(query);
	    pst.setInt(1,sid);
	    pst.setString(2, sname);
	    pst.setString(3, smobile);
	    int count=pst.executeUpdate();
	    System.out.println(count+"row(s) effected");
	    
	    
	   

	}

}
