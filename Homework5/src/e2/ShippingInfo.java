package e2;

public class ShippingInfo  {
	String city, country;
	int  zip;
	
	
	public ShippingInfo(String city, String country, int zip) throws MissingShippingInfoException {
		super();
		checkCity(city);
		checkZip(zip);
		this.city = city;
		this.country = country;
		this.zip = zip;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) throws MissingShippingInfoException {
		checkCity(city);
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) throws MissingShippingInfoException {
		checkZip(zip);
		this.zip = zip;
	}
	
	private void checkCity(String city) throws MissingShippingInfoException {
		if(city.isEmpty()) {
			throw new MissingShippingInfoException();
		}
	}
	
	private void checkZip(int zip) throws MissingShippingInfoException {
		if(zip < 0) {
			throw new MissingShippingInfoException();
		}
	}
	
	
	
}
