package mymultic;

public class MyMetric {
	private static double distance;

	public static double kiloToMile(double d) {
		distance = d / 1.6093;
		return d;
	}

	public static void mileToKilo(double d) {
		distance = d * 1.6093;
	}
}
