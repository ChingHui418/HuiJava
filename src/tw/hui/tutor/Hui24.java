package tw.hui.tutor;

public class Hui24 {

	public static void main(String[] args) {
		// static
		Hui241.m2();
//		Hui241.m2();
//		Hui241.m2();
		Hui241 obj1 = new Hui242();
//		Hui241 obj2 = new Hui241();
//		Hui241 obj3 = new Hui241();
		obj1.m1();
//		obj1.m2();
	
//		
	}

}

class Hui241 {
	// 3
	int a = 123;
	
	// 2
//	{System.out.println("{}");}
	{System.out.println("{}:" + a);}
	static {System.out.println("static {}");}
	
	// --- 1
//	Hui241() {System.out.println("Hui241()");}
	Hui241() {System.out.println("Hui241(): "+ a);}
	void m1() {System.out.println("Hui241:m1()");}
	static void m2() {System.out.println("Hui241:m2()");}
}

class Hui242 extends Hui241 {
	Hui242() {System.out.println("Hui242()");}
}