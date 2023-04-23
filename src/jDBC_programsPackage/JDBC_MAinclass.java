package jDBC_programsPackage;

import java.util.ArrayList;

public class JDBC_MAinclass {
	public static void main(String [] args)
	{
		JDBC_1_program jdbc123 = new JDBC_1_program();

		ArrayList<CityPojo> aaa = new ArrayList<CityPojo>();
		aaa=jdbc123.RetriveData_cityTable();
		//jdbc123.RetriveData_marathonDB();
		int size = jdbc123.RetriveData_cityTable().size();
		System.out.println("The array size is "+size);
		for(int i=0;i<size;i++)
		{
			int id =aaa.get(i).getId();
			String name=aaa.get(i).getName();
			String Country_code =aaa.get(i).getCountrycode();
			String District = aaa.get(i).getDistrict();
			Double Population = aaa.get(i).getPopulation();
			if (id <5)
			System.out.println(id + " -- "+name+ " -- "+Country_code+ " -- "+District+ " -- "+Population);
		}
		
		//jdbc123.insertDataintoDatabase();
	}

	private static char[] aaa(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
