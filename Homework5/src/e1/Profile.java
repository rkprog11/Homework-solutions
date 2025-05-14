package e1;

public class Profile {
	ShippingInfo shippingInfo;
	
	
	public Profile(ShippingInfo shippingInfo) {
		super();
		this.shippingInfo = shippingInfo;
	}

	public ShippingInfo getShippingInfo() {
		return shippingInfo;
	}

	public void setShippingInfo(ShippingInfo shippingInfo) {
		this.shippingInfo = shippingInfo;
	}
	
}
