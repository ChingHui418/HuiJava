package tw.hui.tutor;

public class Hui36 {
	public static void main(String[] args) {
		// Exception 例外, 異常
		int a = 10, b = 3;
		int c;
		int[] d = {1, 2, 3, 4, 5};
		try {
			c = a / b;
			System.out.println(c);
			System.out.println(d[3]);
		}catch(ArithmeticException e) {
			System.out.println("Oooop!");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("XXXXXX!");
		}catch(RuntimeException e) {
			System.out.println("XXX");
		}catch(Exception e) {
		}
		System.out.println("Game Over");
	}
}
