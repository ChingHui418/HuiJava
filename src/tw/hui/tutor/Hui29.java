package tw.hui.tutor;

public class Hui29 {

	public static void main(String[] args) {
		// abstract
		Hui291 obj1 = new Hui292();
		Hui291 obj2 = new Hui293();
		obj1.m1(); obj2.m1();
		obj1.m2(); obj2.m2();
		
		Hui291 obj3 = new Hui291() {
			void m2() {System.out.println("Hui291:m2 5");}
		};
		obj3.m1(); obj3.m2();
	}

}
abstract class Hui291 {
	Hui291() {System.out.println("Hui291()1");}
	void m1() {System.out.println("Hui291:m1()2");}
	abstract void m2();
}
class Hui292 extends Hui291 {
	void m2() {System.out.println("Hui292:m2()3");}
}
class Hui293 extends Hui291 {
	void m2() {System.out.println("Hui293:m2()4");}
}
