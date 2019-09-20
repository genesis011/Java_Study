package chapterUDP;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSend {

	public static void main(String[] args) {
//		1. 데이타그램 소켓을 만든다.
		DatagramSocket dsocket = null;
		InetAddress ia = null;
		try {
			dsocket = new DatagramSocket(6000);
		} catch (SocketException e) {	e.printStackTrace();}
//		2. 보낼테이타를 바이트배열로 만들어 놓는다.
		String data = new String("산은 산이고 밥은 밥이다.");
		byte[] buf = data.getBytes();
//		3. 보내고자 하는 주소를 설정한다.

		try {
			ia = new InetAddress.getByName("192.168.0.228");
		} catch (SocketException e) {	e.printStackTrace();}
//		4. 패킷을 만든다.
		DatagramSocket dp = new DatagramSocket(buf, buf.length, ia, 5000);
		dsocket.send(dp);
	} // end of main
} // end of UDPSend
