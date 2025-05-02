package e1;

public abstract class Article {
	int discountThreshold, householdLimit;
	
	int getBulkDiscount() {
		return 0;
	}
	
	boolean showWarning() {
		return false;
	}
}
