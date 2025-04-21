package exercise1;

public class Textbook extends Book {
	private String subjekt;

	
	
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return super.getInfo() + " Es handelt von " + subjekt + ".";
	}

	public Textbook(String title, int year, String author, String subjekt) {
		super(title, year, author);
		this.subjekt = subjekt;
	}

	public String getSubjekt() {
		return subjekt;
	}

	public void setSubjekt(String subjekt) {
		this.subjekt = subjekt;
	}
	
	
}
