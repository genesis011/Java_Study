package chapter02;

public class chapter2_65p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 변수 선언 lightSpeed, distance
		//2. lightSpeed 상수 값을 저장 300_000
		//3. distace = lghtSpeed*(1년->초)
		//4. distance 값을 출력하는데 printf.println
		
		long lightSpeed=0L;
		long distance=0L;
		lightSpeed=300_000L;
		distance=lightSpeed * 365L *24*60*60;
		System.out.println("1년 동안 빛이 가는 거리"+ distance+"km");
		System.out.printf("1년 동안 빛이 가는 거리"+distance+"km\n");
	}
}
