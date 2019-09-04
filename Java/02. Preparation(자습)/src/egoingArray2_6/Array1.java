package egoingArray2_6;

public class Array1 {

	public static void main(String[] args) {
		String[] classCroup= {"최진혁","최유빈","한아림","이고잉"};
		System.out.println(classCroup[1]);
		System.out.println(classCroup.length); //4개의 값이 담겨질 수 있다는의미
		//0번: 최진혁, 1번: 최유빈, 2번: 한아림, 3번: 이고잉
	String[] classGroup1=new String[4]; //4개의 값이 담겨질 수 있다는의미
	classGroup1[0]="최진혁";
	System.out.println(classGroup1.length); //4개의 값이 담겨질 수 있다는의미
	
	classGroup1[1]="최유빈";
	System.out.println(classGroup1.length); //4개의 값이 담겨질 수 있다는의미
	
	classGroup1[2]="한아림";
	System.out.println(classGroup1.length); //4개의 값이 담겨질 수 있다는의미
	
	classGroup1[3]="이고잉";
	System.out.println(classGroup1.length); //4개의 값이 담겨질 수 있다는의미
	}
}
