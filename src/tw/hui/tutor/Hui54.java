package tw.hui.tutor;

import java.net.InetAddress;
import java.net.Socket;

public class Hui54 {

	public static void main(String[] args) {
		// for (int i=0; i<65536; i++) {
			try (Socket socket = new Socket(InetAddress.getByName("10.0.101.187"), 9999)){
				System.out.println("OK");
				// System.out.println("OK" + i);
			} catch (Exception e) {
				System.out.println(e);
			}
		// }

	}

}
