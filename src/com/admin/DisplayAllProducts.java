package com.admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;


public class DisplayAllProducts {
    
	
	public void getProductList() throws SQLException
	{     Scanner sc=new Scanner(System.in);
		System.out.println("        ======================================All Categories======================================");
	
		//mobiles list
		List<Products> mobiles=new ArrayList<>();
		Connection con=null;
		PreparedStatement ps=null;
		try {
			Db_Connection db_Connection=new Db_Connection();
		   	con=db_Connection.getConnection();
			ps=con.prepareStatement("select * from products where  Category=?");
			ps.setString(1, "mobiles");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				mobiles.add(new Products(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getString(4),rs.getInt(5)));
			}
			System.out.println("\n\t\t\t\t             ****Mobiles****");
			System.out.print("\t\t\t\t             ---------------");
			System.out.println("\t\t\t\t"+mobiles );
		}
		catch (Exception e) {
		System.out.println(e.getMessage());	
		}
		
		
		//sports lists
		List<Products> clothes=new ArrayList<>();
		
		try {
			Db_Connection db_Connection=new Db_Connection();
			con=db_Connection.getConnection();
			ps=con.prepareStatement("select * from products where  Category=? ");
			ps.setString(1, "clothes");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				clothes.add(new Products(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getString(4),rs.getInt(5)));
			}
			System.out.println("\n\t\t\t\t             ****Clothes****");
			System.out.print("\t\t\t\t             ---------------");
			System.out.println("\t\t\t\t"+clothes );
		}
		catch (Exception e) {
		System.out.println(e.getMessage());	
		}

		//furniture list
		List<Products> homede=new ArrayList<>();
		try {
			Db_Connection db_Connection=new Db_Connection();
			con=db_Connection.getConnection();
			ps=con.prepareStatement("select * from products where  Category=?");
			ps.setString(1, "homede");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				homede.add(new Products(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getString(4),rs.getInt(5)));
			}
			System.out.println("\n\t\t\t\t             ****homedecor****");
			System.out.print("\t\t\t\t             ------------------");
			System.out.println("\t\t\t\t"+homede );
		}
		
		catch (Exception e) {
		System.out.println(e.getMessage());	
		}

		List<Products> Headps=new ArrayList<>();
		try {
			Db_Connection db_Connection=new Db_Connection();
			con=db_Connection.getConnection();
			ps=con.prepareStatement("select * from products where  Category=?");
			ps.setString(1, "Headps");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Headps.add(new Products(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getString(4),rs.getInt(5)));
			}
			System.out.println("\n\t\t\t\t             ****Headphones****");
			System.out.print("\t\t\t\t             ------------------");
			System.out.println("\t\t\t\t"+Headps );
		}
		
		catch (Exception e) {
		System.out.println(e.getMessage());	
		}

		System.out.println("\n        ==========================================================================================");

			
	}
	
}
