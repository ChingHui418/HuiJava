package tw.hui.tutor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Hui56 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9999);
			// System.out.println("Listen...");
			Socket socket = server.accept();  // Listen
			
			// InputStream in = socket.getInputStream();
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			String line;
			while((line = reader.readLine()) != null ) {
				System.out.println(line);
			}
			
			reader.close();
			socket.close();
			server.close();

			System.out.println("Server OK");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
