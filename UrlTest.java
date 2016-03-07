package test;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlTest {

	public static void main(String[] args) throws MalformedURLException {
		URL hp = new URL("www.google.co.in");
		System.out.println("this URL's protocol is :"+hp.getProtocol());
		System.out.println("this URL's port is:"+hp.getPort());
		System.out.println("this URL's host is :"+hp.getHost());
	}

}
