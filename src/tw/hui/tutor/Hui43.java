package tw.hui.tutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Hui43 {

	public static void main(String[] args) {
		File source = new File("dir1/file2.txt");
		try {
			FileInputStream fin = new FileInputStream(source);
			// 2G 以內
			byte[] buf = new byte[(int)source.length()];
			fin.read(buf);
			System.out.println(new String(buf));
			
//			int c;
//			while((c = fin.read()) != -1) {
//				System.out.print((char)c);
//			}
		
//			int len; byte[] buf = new byte[3];
//			while((len = fin.read(buf)) != -1) {
//				System.out.print(new String(buf, 0, len));
//			}
			
//			int c = fin.read();
//			System.out.println((char)c);
//			c = fin.read();
//			System.out.println((char)c);

			fin.close();
//			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
