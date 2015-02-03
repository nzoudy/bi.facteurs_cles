package ingesup.expert1.BI.bi.entity;

public class Country {
	
	private int id;
	private String countryName;
	
	public Country() {
		
	}

	public Country(String countryName) {
		this.countryName = countryName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	
}
