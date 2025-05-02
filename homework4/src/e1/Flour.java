package e1;

public class Flour extends PopularGrocery {

	Flour(int quantity, int discountThreshold, int populartityLevel){
		super(populartityLevel);
		this.quantity = quantity;
		this.discountThreshold = discountThreshold;		
		this.householdLimit = 15;
	}
	@Override
	int getBulkDiscount() {
		return (quantity >= discountThreshold) ? 5 : 0;
	}
	
}
