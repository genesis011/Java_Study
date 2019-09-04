package complex.app;

public class Complex {
	private int real;
	private int imag;
	
	public Complex() {
		this.real=0;
		this.imag=0;
	}		
	public Complex(int real, int imag) {
		this.real=real; this.imag=imag;
	}
	public void setReal(int real) {
		this.real=real;
	}
	public void setImag(int imag) {
		this.imag=imag;
	}
	public int getReal() {
		return real;
	}
	public int getImag() {
		return imag;
	}
	public void print(int i) {
		System.out.print(real+" + "+imag+"*"+i);
		System.out.print("="+(real+imag*i));
	}
}
