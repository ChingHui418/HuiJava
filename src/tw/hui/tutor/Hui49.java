package tw.hui.tutor;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import tw.hui.apis.Student;

public class Hui49 {
	// 讀取檔案
	public static void main(String[] args) {
		try(ObjectInputStream oin = new ObjectInputStream(
				new FileInputStream("dir1/hui.score"))){
			
			Student s3 = (Student)oin.readObject();
			System.out.printf("%s : %d : %f : %s\n", s3.getName(), s3.score(), s3.avg(), s3.getBike());
			Student s4 = (Student)oin.readObject();
			System.out.printf("%s：%d：%f\n", s4.getName(), s4.score(), s4.avg());
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
