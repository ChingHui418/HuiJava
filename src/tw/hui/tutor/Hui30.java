package tw.hui.tutor;

public class Hui30 {

	public static void main(String[] args) {
		// interface
		Hui301 obj1 = new Hui302();
		Hui303 obj2 = new Hui302();
		obj1.m1();
		obj2.m3();
	}

}
interface Hui301 {
	void m1();
	void m2();
}
class Hui302 implements Hui301, Hui303 {
	public void m1() {}
	public void m2() {}
	public void m3() {}
	public void m4() {}
}
interface Hui303 {
	void m3();
	void m4();
}