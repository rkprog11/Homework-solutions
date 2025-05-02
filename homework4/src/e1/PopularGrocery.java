package e1;

public abstract class PopularGrocery extends GroceryItem {
	int popularityLevel, quantity;
	
	PopularGrocery(int populatityLevel){
		isPopular = true;
		this.popularityLevel = populatityLevel;
	}
	@Override
	boolean showWarning() {
		return (quantity > householdLimit) ? true : false;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
