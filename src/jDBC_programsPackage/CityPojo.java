package jDBC_programsPackage;

public class CityPojo 
{
	private int id;
	private String name;
	private String countrycode;
	private String district;
	private double population;

	public CityPojo() {
//		super();
		this.id = id;
		this.name = name;
		this.countrycode = countrycode;
		this.district = district;
		this.population = population;
	}
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCountrycode() {
		return countrycode;
	}



	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}



	public String getDistrict() {
		return district;
	}



	public void setDistrict(String district) {
		this.district = district;
	}



	public double getPopulation() {
		return population;
	}



	public void setPopulation(double population) {
		this.population = population;
	}


}
