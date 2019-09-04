package movie;

public class MovieTest {

	public static void main(String[] args) {
		Movie m = new Movie();
		m.setTitle("Transformer");
		m.setDirector("john");
		m.setActors("LK");
		System.out.println(m.getTitle());
		System.out.println(m.getDirector());
		System.out.println(m.getActors());
	}

}
