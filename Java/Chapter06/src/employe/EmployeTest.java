package employe;

public class EmployeTest {

	public static void main(String[] args) {
		Employe emp =new Employe();
		Employe e1,e2,e3;
		e1= new Employe(34000,"aaa");
		e2= new Employe(35000,"aaa");
		e3= new Employe(36000,"aaa");
		System.out.println("Á÷¿ø¼ö"+Employe.getCount());
	}
}
