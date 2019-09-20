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
			// 클라이언트가 접속해오기를 기다리고 있는 상태
//		만약에 접속해오면 클라이언트 SOKET을 만든단.
			System.out.println("클라이언트 접속하기를 기다린다.");
			Socket socket = ss.accept();
			
//			InetAddrss ia =socket.getAddress();
//			System.out.println(ia.getHostAddress()+"님이 접속" );
			OutputStream os = socket.getOutputStream();
			
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String data = br.readLine();// .대기상태
			System.out.println(data);
			PrintStream ps = new PrintStream(os);
//			ps.println(ia.getHostAddress()+"님"data+"말씀 고맙습니다.") //교수님 컴터에서 날라옴
			ps.println(new Date().toString());
			ps.close();
			break;
		} // end of while
		ss.close();
	}
}
