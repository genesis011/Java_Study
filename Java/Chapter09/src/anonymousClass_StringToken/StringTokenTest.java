package anonymousClass_StringToken;

import java.util.StringTokenizer;

public class StringTokenTest {

	public static void main(String[] args) {
		String[] strArray=new String[10];//������ �� �� =null;
		String str=new String("By do");
		StringTokenizer st=new StringTokenizer(str);
		int i=0;
		while(st.hasMoreTokens()) {
			strArray[i++]=st.nextToken();
//			System.out.println(st.nextToken());
			System.out.println(strArray[i-1]);
		}
	}
}
