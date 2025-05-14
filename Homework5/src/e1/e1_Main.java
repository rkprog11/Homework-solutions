package e1;

public class e1_Main {

	public static void main(String[] args) {
		ShippingInfo info = new ShippingInfo("Munich", "Germany", 80331);
		Profile profile = new Profile(info);
		Customer customer = new Customer(profile, 123);
		
		System.out.println("Shipping to: " + customer.getProfile().getShippingInfo().getCity());

	}

	/*
	 * 2) Yes, because for example customer is dependent on profile, as it is an attribute, and customer doesn't create the profile object,
	 *    but rather takes an already existing one (through the constructor or the setter).
	 * 
	 * 3) The law of demeter is broken, because in line 10 is a method call chain.
	 * 	  The problem can be fixed by adding methods in the classes who access the info "locally", e.g. in customer a method printCity
	 *    that uses the getters to get the city from the shipping info. In the main method you only need to call custommer.printcity().
	 */
}
