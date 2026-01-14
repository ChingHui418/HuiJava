

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Hui57 {

	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 7216);
			BufferedOutputStream bout = new BufferedOutputStream(socket.getOutputStream());
			
			BufferedInputStream bin = 
					new BufferedInputStream(new FileInputStream("dir1/img.jpg"));
			byte[] buf = new byte[4*1024*1024];
			int len;
			while((len = bin.read(buf)) != -1) {
				bout.write(buf, 0, len);
			}
			
			bin.close();
			bout.flush();
			bout.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
