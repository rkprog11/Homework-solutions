package exercise1;

public class E1_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book hp = new Book("hp1",1997,"jkr");
		Textbook math = new Textbook("Mathe 1", 2025, "Mathe Prof", "Analysis");
		System.out.println(hp.getInfo());
		System.out.println(math.getInfo());
	}

}
