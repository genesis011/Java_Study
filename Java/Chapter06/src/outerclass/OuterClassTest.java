package outerclass;

public class OuterClassTest {

	public static void main(String[] args) {
		OuterClass.StaticClass staticClass=new OuterClass.StaticClass();
// 		staticClass.staticMyMethod();//오류해결 요망
		
		OuterClass outer=new OuterClass();
		OuterClass.InnerClass inner=outer.new InnerClass();
		inner.innerMyMethod();
	}

}
