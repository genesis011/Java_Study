package chapter02;

public class chapter2_65p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. ���� ���� lightSpeed, distance
		//2. lightSpeed ��� ���� ���� 300_000
		//3. distace = lghtSpeed*(1��->��)
		//4. distance ���� ����ϴµ� printf.println
		
		long lightSpeed=0L;
		long distance=0L;
		lightSpeed=300_000L;
		distance=lightSpeed * 365L *24*60*60;
		System.out.println("1�� ���� ���� ���� �Ÿ�"+ distance+"km");
		System.out.printf("1�� ���� ���� ���� �Ÿ�"+distance+"km\n");
	}
}
