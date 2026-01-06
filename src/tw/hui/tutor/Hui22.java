package tw.hui.tutor;

public class Hui22 {

	public static void main(String[] args) {
		// String2
		System.out.println("Hui".charAt(2));
		String s1 = "Hui";
		String s2 = "Hui";
		int a = 10, b = 3;
		System.out.println(a == b);  // 比值
		System.out.println(s1 == s2); // (記憶體位置)
		
		String s3 = new String("Hui"); 
		String s4 = new String("Hui");
		System.out.println(s3 == s4); // 記憶體位置不會一樣
		System.out.println(s1 == s3);
		
		System.out.println(s1.equals(s4));
	}

}
