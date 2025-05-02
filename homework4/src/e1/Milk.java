package e1;

public class Milk extends PopularGrocery {
	
	Milk(int quantity, int discountThreshold, int populartityLevel){
		super(populartityLevel);
		this.discountThreshold = discountThreshold;
		this.quantity = quantity;
		this.householdLimit = 20;
	}
	
	@Override
	int getBulkDiscount() {
		return (quantity >= discountThreshold) ? 12 : 0;
	}
}
