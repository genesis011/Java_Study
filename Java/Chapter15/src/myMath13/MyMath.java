package myMath13;

class MyMath<T extends Number> {

	double v = 0.0;

	public double getAverage(T[] a) {

		for (int i = 0; i < a.length; i++)
			v = v + a[i].doubleValue();
		return v / a.length;
	}
}
