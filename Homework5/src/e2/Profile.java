package e2;

public class Profile {
	ShippingInfo shippingInfo;
	
	
	public Profile(ShippingInfo shippingInfo) throws InvalidShippingInfoException {
		super();
		checkShippingInfo(shippingInfo);
		this.shippingInfo = shippingInfo;
	}

	public ShippingInfo getShippingInfo() {
		return shippingInfo;
	}

	public void setShippingInfo(ShippingInfo shippingInfo) throws InvalidShippingInfoException {
		checkShippingInfo(shippingInfo);
		this.shippingInfo = shippingInfo;
	}
	
	private void checkShippingInfo(ShippingInfo shippingInfo) throws InvalidShippingInfoException {
		if(shippingInfo == null) {
			throw new InvalidShippingInfoException();
		}
	}
}
