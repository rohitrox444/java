package test;
import java.net.*;

public class NetworkingTest {

	
	public static void main(String[] args) throws UnknownHostException {
		InetAddress obj = InetAddress.getLocalHost();
		System.out.println(obj);
		obj= InetAddress.getByName("www.facebook.com");
		System.out.println(obj);
		InetAddress sw[] = InetAddress.getAllByName("www.facebook.com");
		for(int i=0;i<sw.length;i++){
			System.out.println(sw[i]);
		}
		
		System.out.println(obj.equals(sw));
		byte[] b = obj.getAddress();
		System.out.println(b);
		String frombyte = b.toString();
		System.out.println(frombyte);
		System.out.println(obj.getHostAddress());
		System.out.println(obj.isMulticastAddress());
		System.out.println(obj.toString());
		InetAddress obj2 = InetAddress.getLocalHost();
		System.out.println(obj2.getHostAddress());
		
		
		
	}

}
