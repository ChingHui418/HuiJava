package tw.hui.tutor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Hui50 {

	public static void main(String[] args) {
		Hui503 obj = new Hui503();
		try(ObjectOutputStream oout = new ObjectOutputStream(
				new FileOutputStream("dir1/xx.xx"))) {
			oout.writeObject(obj);
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("----");
		try(ObjectInputStream oin = new ObjectInputStream(
				new FileInputStream("dir1/xx.xx"))) {	
			Object obj1 = oin.readObject();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
class Hui501 implements Serializable  {
	Hui501(){System.out.println("Hui501()");}
}
class Hui502 extends Hui501 {
	Hui502(){System.out.println("Hui502()");}
}
class Hui503 extends Hui502{
	Hui503(){System.out.println("Hui503()");}
}
