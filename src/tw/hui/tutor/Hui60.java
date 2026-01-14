package tw.hui.tutor;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class Hui60 {

	public static void main(String[] args) {
		// http
		try {
			URL url = new URL("https://s.yimg.com/ny/api/res/1.2/jff.1wfdgbV7dGd_HC7ZCA--/YXBwaWQ9aGlnaGxhbmRlcjt3PTk2MDtoPTU0MDtjZj13ZWJw/https://media.zenfs.com/ko/setn.com.tw/72e139fe2c27f7c606a1c2cb17f4cd50");
			URLConnection conn = url.openConnection();

			BufferedInputStream bin = new BufferedInputStream(conn.getInputStream());
			byte[] data = bin.readAllBytes();
			
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("dir1/test.jpg"));
			
			bout.write(data);
			bout.flush();
			bout.close();
			System.out.println("OK");
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
