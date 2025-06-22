package e3;

import java.util.ArrayList;
import java.util.Comparator;

public class e3_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		movieList.add(new Movie("The Return of the King",2003,9.0));
		movieList.add(new Movie("The Fellowship of the Ring",2001,8.9));
		movieList.add(new Movie("The Two Towers",2002,8.8));	
		movieList.add(new Movie("An Unexpected Journey",2012,7.8));
		movieList.add(new Movie("The Desolation of Smaug",2013,7.8));
		movieList.add(new Movie("The Battle of the Five Armies",2014,7.4));
		
		
		
		movieList.stream().filter(s -> s.getRating() >= 8.5).sorted(Comparator.comparing(Movie::getYear).reversed().thenComparing(Movie::getRating).reversed()).map(Movie::toString).forEach(System.out::println);
		}

}
