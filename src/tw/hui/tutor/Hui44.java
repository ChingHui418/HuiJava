package tw.hui.tutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Hui44 {

	public static void main(String[] args) {
		// 讀取image
		long start = System.currentTimeMillis();
		try {
			FileInputStream fin = new FileInputStream("dir1/img.jpg");
			FileOutputStream fout = new FileOutputStream("dir2/hui.jpg");
			
			int b;
			while((b = fin.read()) != -1) {
				fout.write(b);
			}
			
			fout.flush();
			fout.close();
			fin.close();
			long time = System.currentTimeMillis() - start;
			System.out.println("OK:" + time);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
