package array;

public class A1_SteingTest {

	public static void main(String[] args) {
		String str1="abc";
		String str2=new String("abc");
		System.out.println("str1"+str1);
		System.out.println("str2"+str2);
		if(str1.equals("abc")) {
			//if(str1.equals(new String("abc"))) { =>위의 코드와 같음
			System.out.println("같습니다");
		}else {
			System.out.println("다릅니다.");
		}
	}

}
