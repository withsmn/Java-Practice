package Javaassociation;

public class PostalAddress {
	private String house;
	private String road;
	private String city;
	private String zipCode;
	public PostalAddress(String house, String road, String city, String zipCode) {
		super();
		this.house = house;
		this.road = road;
		this.city = city;
		this.zipCode = zipCode;
	}
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public String getRoad() {
		return road;
	}
	public void setRoad(String road) {
		this.road = road;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "PostalAddress [house=" + house + ", road=" + road + ", city=" + city + ", zipCode=" + zipCode + "]";
	}
	

}
