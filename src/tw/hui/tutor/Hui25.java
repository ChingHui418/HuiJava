package tw.hui.tutor;

public class Hui25 {

	public static void main(String[] args) {
		Hui251 obj1 = new Hui251(); obj1.m1();
		Hui252 obj2 = new Hui252(); obj2.m1(); obj2.m2();
		
		Hui251 obj3 = new Hui252();
		obj3.m1();
		
		Hui252 obj4 = (Hui252)obj3;
		obj4.m2();
		
		Hui251 obj5 = new Hui253();
		obj5.m1();
		
		
		
		// 強制轉型回來 -> 有關係，但轉不回去
//		Hui253 obj6 = (Hui253)obj3;
		System.out.println("---");
		
		go(obj1);
		go(obj2);
		go(obj3);
		go(obj4);
		go(obj5);
		System.out.println("---");
		
		// 詢問關係 
		if(obj3 instanceof Hui253) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		
		if(obj4 instanceof Hui252) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		if(obj5 instanceof Hui253) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
	
	static void go(Hui251 obj) {
		obj.m1();
	}

}
class Hui251 {
	void m1() {System.out.println("Hui251:m1()");}
}
class Hui252 extends Hui251 {
	void m1() {System.out.println("Hui252:m1()");}
	void m2() {System.out.println("Hui252:m2()");}
}
class Hui253 extends Hui252 {
	void m1() {System.out.println("Hui253:m1()");}
}
