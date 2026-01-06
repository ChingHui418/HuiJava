package tw.hui.tutor;

public class Hui08 {

	public static void main(String[] args) {
		// and
		int a = 10, b = 3;
		if (a++ > 10 && b-- < 3) {
			System.out.printf("OK: a = %d; b = %d", a, b);
		}else {
			System.out.printf("XX: a = %d; b = %d", a, b);
		}
		// => XX: a = 11; b = 3
		
		System.out.println("");
		
		// or
		int c = 10, d = 3;
		if (c++ > 10 || d-- < 3) {
			System.out.printf("OK: c = %d; d = %d", c, d);
		}else {
			System.out.printf("XX: c = %d; d = %d", c, d);
		}
		// XX: c = 11; d = 2
	}

}
