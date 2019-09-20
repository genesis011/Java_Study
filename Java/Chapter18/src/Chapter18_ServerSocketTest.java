import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Chapter18_ServerSocketTest {


	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(9100);
		while (true) {
			// Ŭ���̾�Ʈ�� �����ؿ��⸦ ��ٸ��� �ִ� ����
//		���࿡ �����ؿ��� Ŭ���̾�Ʈ SOKET�� �����.
			System.out.println("Ŭ���̾�Ʈ �����ϱ⸦ ��ٸ���.");
			Socket socket = ss.accept();
			
//			InetAddrss ia =socket.getAddress();
//			System.out.println(ia.getHostAddress()+"���� ����" );
			OutputStream os = socket.getOutputStream();
			
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String data = br.readLine();// .������
			System.out.println(data);
			PrintStream ps = new PrintStream(os);
//			ps.println(ia.getHostAddress()+"��"data+"���� �����ϴ�.") //������ ���Ϳ��� �����
			ps.println(new Date().toString());
			ps.close();
			break;
		} // end of while
		ss.close();
	}
}
