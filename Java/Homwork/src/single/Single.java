package single;

public class Single {
	private static Single s_instance;

	public static Single getInstance() {
		if (s_instance == null) {
			s_instance = new Single();
		}
		return s_instance;
	}
}
