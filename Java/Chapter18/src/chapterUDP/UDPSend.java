package chapterUDP;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSend {

	public static void main(String[] args) {
//		1. ����Ÿ�׷� ������ �����.
		DatagramSocket dsocket = null;
		InetAddress ia = null;
		try {
			dsocket = new DatagramSocket(6000);
		} catch (SocketException e) {	e.printStackTrace();}
//		2. ��������Ÿ�� ����Ʈ�迭�� ����� ���´�.
		String data = new String("���� ���̰� ���� ���̴�.");
		byte[] buf = data.getBytes();
//		3. �������� �ϴ� �ּҸ� �����Ѵ�.

		try {
			ia = new InetAddress.getByName("192.168.0.228");
		} catch (SocketException e) {	e.printStackTrace();}
//		4. ��Ŷ�� �����.
		DatagramSocket dp = new DatagramSocket(buf, buf.length, ia, 5000);
		dsocket.send(dp);
	} // end of main
} // end of UDPSend
