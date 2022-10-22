package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.admin.*;

public class Registration {

	public void registerUser() throws SQLException, ClassNotFoundException {
		Connection con=null;
		PreparedStatement ps=null;
		try {
			System.out.println("<<<<<<<<<<<<<<<<< Enter The User Information >>>>>>>>>>>>>>");
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the User Name");
			String userName = sc.nextLine();
			
			System.out.println("Enter the Password");
			String passWord = sc.nextLine();
			
			System.out.println("Enter Firstname");
			String firstName = sc.nextLine();
			
			System.out.println("Enter Lastname");
			String lastName = sc.nextLine();
			
			System.out.println("Enter City");
			String city = sc.nextLine();
			
			System.out.println("Enter Mobile Number");
			String mobileNumber = sc.nextLine();
			
			Db_Connection dbconnection = new Db_Connection();
			con = dbconnection.getConnection();
			
			ps = con.prepareStatement("insert into user(username,password,fname,lname,city,mobno)values(?,?,?,?,?,?)");
			
			ps.setString(1, userName);
			ps.setString(2, passWord);
			ps.setString(3, firstName);
			ps.setString(4, lastName);
			ps.setString(5, city);
			ps.setString(6, mobileNumber);
			ps.executeUpdate();
			
			System.out.println("**********REGISTRATION SUCCESSFULL**********");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
}
