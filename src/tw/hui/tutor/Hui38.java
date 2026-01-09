package tw.hui.tutor;

public class Hui38 {

	public static void main(String[] args) {
		// finally
		Hui381.m1();
	}

}
class Hui381 {
	static void m1() {
		try {
			System.out.println(10 / 0);;
			System.out.println("try");
			//return;
		}catch(Exception e) {
			System.out.println("ee");
			return;
		}finally {
			System.out.println("f");
		}
		System.out.println("OK");
	}
}
