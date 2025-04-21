package exercise1;

public class Book extends Publication {
	private String author;

	
	
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return super.getInfo() + " Es ist von " + author + ".";
	}

	public Book(String title, int year, String author) {
		super(title, year);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
