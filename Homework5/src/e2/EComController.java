package e2;


public class EComController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		ShippingInfo info = new ShippingInfo("Munich", "Germany", 80331);
		Profile profile = new Profile(info);
		Customer customer = new Customer(profile, -123);
		
		System.out.println("Shipping to: " + customer.getProfile().getShippingInfo().getCity());
		} catch (InvalidCustomerException e) {
			System.out.println("The profile is missing or the id is negativ!");
		} catch (MissingShippingInfoException e) {
			System.out.println("The city is missing or the zip is negativ!");
		} catch (InvalidShippingInfoException e) {
			System.out.println("The shippingInfo is missing!");
		}
	}
	
	/*1) The thread stops running or the code doesn't get compiled.
	 * 
	 *2) If catching all Exceptions, you might catch one that you dont't know of and search for the problem in the code while the program isn't working as intended.
	 *
	 *3) The try closes the resources after they are used. Then you dont't have to close them manually.
	 *	 You should use them if you are working with resources that might not exist or cause any other problems because then you don't have to check for them when closing.
	 */
}
