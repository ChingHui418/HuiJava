package tw.hui.tutor;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import tw.hui.apis.Student;

public class Hui48 {
	// 寫入檔案
	public static void main(String[] args) {
		// 物件序列化
		Student s1 = new Student("Hui", 70, 80, 90);
		
		s1.getBike().upSpeed().upSpeed().upSpeed().upSpeed();
		System.out.printf("%s : %d : %f : %s\n", s1.getName(), s1.score(), s1.avg(), s1.getBike());
		
		Student s2 = new Student("Tony", 98, 90, 86);
		System.out.printf("%s：%d：%f\n", s2.getName(), s2.score(), s2.avg(), s2.getBike());
		
		try(FileOutputStream fout = new FileOutputStream("dir1/hui.score");
				ObjectOutputStream oout = new ObjectOutputStream(fout)) {
				
			oout.writeObject(s1);
			oout.writeObject(s2);
			oout.flush();
			System.out.println("OK");
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
