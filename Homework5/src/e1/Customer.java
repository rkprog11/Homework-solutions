package e1;

public class Customer {
	Profile profile;
	int id;
	
	
	public Customer(Profile profile, int id) {
		super();
		this.profile = profile;
		this.id = id;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
