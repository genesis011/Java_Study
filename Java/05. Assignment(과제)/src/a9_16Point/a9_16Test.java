package a9_16Point;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.StringTokenizer;

public class a9_16Test {

	public static void main(String[] args) {
		Random random = new Random();
		System.out.println(random.nextInt(100));
		
		StringTokenizer st = new StringTokenizer("001-02-777", "-");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		Date today = new Date();
		System.out.println(today);
		SimpleDateFormat date =new SimpleDateFormat("yyy / MM / dd");
		SimpleDateFormat time =new SimpleDateFormat("hh : mm : ss a");
		
		System.out.println("Date: "+date.format(today));
		System.out.println("Time: "+time.format(today));
		
		a9_16Test obj =new a9_16Test();
		System.out.println("The class of" + obj + "is" + obj.getClass().getName());
		for (int i = 0; i <= 90; i += 5) {
			System.out.println(Math.sin(Math.toRadians((double) i)));
		}
	}
}
