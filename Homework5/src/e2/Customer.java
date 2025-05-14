package e2;

public class Customer {
	Profile profile;
	int id;
	
	
	public Customer(Profile profile, int id) throws InvalidCustomerException {
		super();
		checkId(id);
		checkProfile(profile);
		this.profile = profile;
		this.id = id;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) throws InvalidCustomerException {
		checkProfile(profile);
		this.profile = profile;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) throws InvalidCustomerException {
		checkId(id);
		this.id = id;
	}
	private void checkId(int id) throws InvalidCustomerException {
		if(id < 0) {
			throw new InvalidCustomerException();
		}
	}
	
	private void checkProfile(Profile profile) throws InvalidCustomerException {
		if(profile == null) {
			throw new InvalidCustomerException();
		}
	}

	
}
