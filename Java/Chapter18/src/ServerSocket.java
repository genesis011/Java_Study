import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServerSocket {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("192.168.0.228", 9100);
		

		OutputStream os = socket.getOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(os);
		PrintStream ps = new PrintStream(bos);
		ps.println("교수님 짱이에요");
		ps.flush();
		
		InputStream is = socket.getInputStream();
		InputStreamReader ist = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ist);
		
		System.out.println("서버로부터 답변을 기다리고 있습니다.");// 바로진행
		
		String data = br.readLine();// 대기상태
		System.out.println(data);
		br.close();
	}
}
