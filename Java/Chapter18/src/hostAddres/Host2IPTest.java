package hostAddres;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Host2IPTest {

	public static void main(String[] args) throws UnknownHostException {
		String hostName="www.kokoboa.com";
		InetAddress inetAddress=InetAddress.getByName(hostName);
		System.out.println(hostName+"ÁÖ¼Ò´Â"+inetAddress.getHostAddress());
	}
}
