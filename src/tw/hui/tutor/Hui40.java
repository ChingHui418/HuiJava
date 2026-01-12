package tw.hui.tutor;

import java.io.File;

public class Hui40 {

	public static void main(String[] args) {
		// File 搭配
		File f1 = new File("c:/brad/test");
		if(f1.exists()) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
	}

}
