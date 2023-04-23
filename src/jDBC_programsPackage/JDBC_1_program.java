package jDBC_programsPackage;

import java.awt.List;
import java.sql.Connection;
import jDBC_programsPackage.CityPojo;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

//import file_Handling_package.City;

public class JDBC_1_program {
	CityPojo cp;
	
	public void RetriveData_marathonDB()
	{
				try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/marathon","root","@n@ndA@321");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from registration");  
			while(rs.next())  
			System.out.println(rs.getString(1)+"--"+rs.getString(2)+"--"+rs.getString(3)+"--"+rs.getString(4)+"  "+rs.getInt(5)+"  "+rs.getString(6)+"--"+rs.getString(7)+"--"+rs.getString(8)+"--"+rs.getString(9)+"  "+rs.getInt(10)+"  "+rs.getString(11));  
			con.close();  
			}
				catch(Exception e){ System.out.println(e);}  
			}  
	
// THIS METHOD IS USED TO RETRIVE DATA FROM CITY TABLE OF WORLD DATA BASE...
	public ArrayList<CityPojo> RetriveData_cityTable()
	{
		ArrayList<CityPojo> cplist = new ArrayList<CityPojo>();

		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","@n@ndA@321");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			//ResultSet rs=stmt.executeQuery("select * from city where id between '1' and '500'");
			ResultSet rs=stmt.executeQuery("select * from city");
			while(rs.next())
			{
				 cp= new CityPojo();
			//System.out.println(rs.getString(1)+"--"+rs.getString(2)+"--"+rs.getString(3)+"--"+rs.getString(4)+"  "+rs.getInt(5));  
			//if(rs.getInt(1)==1)
			
				 cp.setId(rs.getInt("id"));;
			cp.setName(rs.getString("name"));
			cp.setCountrycode(rs.getString("countrycode"));
			cp.setDistrict(rs.getString("district"));
			cp.setPopulation(rs.getInt("population"));
			cplist.add(cp);
			
			}
			con.close();
			}catch(Exception e){ System.out.println(e);}
		return cplist;  
			}  
	
	public void insertIntoCityTable(java.util.List<CityPojo> cit)
	{
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","@n@ndA@321");  
			//here sonoo is database name, root is username and password  
			PreparedStatement stmt=con.prepareStatement("insert into city values(?,?,?,?,?)");
			int size12 = cit.size();
			for(int i=0;i<size12;i++)
			{
				System.out.println("=================================== inside jdbc");
				stmt.setInt(1, cit.get(i).getId());
				stmt.setString(2, cit.get(i).getName());
				stmt.setString(3, cit.get(i).getCountrycode());
				stmt.setString(4, cit.get(i).getDistrict());
				//stmt.setInt(5,cit.get(i).getPopulation());
				stmt.executeUpdate();
				//stmt.close();
				System.out.println("Data insert succesffully");
			}
		}

		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	public void insertDataintoDatabase()
	
	{
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/marathon","root","@n@ndA@321");  
			//here sonoo is database name, root is username and password  
			PreparedStatement stmt=con.prepareStatement("insert into registration values(?,?,?,?,?,?,?,?,?,?,?)");
			
			stmt.setString(1, "soma");

			stmt.setString(2, "soma");

			stmt.setString(3, "soma");
			

			stmt.setString(4, "soma");
			stmt.setDouble(5, 849838);
			stmt.setString(6, "soma");
			stmt.setString(7, "soma");
			stmt.setString(8, "soma");
			stmt.setString(9, "soma");
			stmt.setDouble(10, 48494);
			stmt.setString(11, "soma");
			
			int i = stmt.executeUpdate();
			stmt.close();
			System.out.println("Data insert succesffully");
	}
		catch (Exception e) {
			// TODO: handle exception
		}

}
}