package com.JDBCsample;
import java.sql.*;
import java.util.Scanner;

public class adduserstudent {

public static void main(String[] args)throws Exception {
	Scanner scan=new Scanner(System.in);
	// TODO Auto-generated method stub
	Class.forName("com.mysql.cj.jdbc.Driver");
  	String url="jdbc:mysql://localhost:3306/hostel";
  	String username="root";
  	String password="72041999";
   Connection sp=DriverManager.getConnection(url,username,password);
   System.out.println("********add student values to db**********");
   System.out.println("enter studentId");
   int sid=scan.nextInt();
   scan.nextLine();
   System.out.println("enter studentName");
   String sname=scan.nextLine();
   System.out.println("enter studentMobile");
   String smobile=scan.nextLine();
    String query="insert into student values(?,?,?)";
    PreparedStatement pst= sp.prepareStatement(query);
    pst.setInt(1,sid);
    pst.setString(2,sname);
    pst.setString(3,smobile);
    int count=pst.executeUpdate();
    System.out.println(count+"row(s) effected");
    sp.close();
    scan.close();
    
    
   

}

}
