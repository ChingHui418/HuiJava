package tw.hui.tutor;

public class Hui06 {

	public static void main(String[] args) {
//		boolean a = false;
//		if(a) {
//			System.out.println("OK");
//		}else {
//			System.out.println("XX");
//		}
//		
//		int score = 60;
//		if(score >= 60) {
//			System.out.println("Pass");
//		}else {
//			System.out.println("Down");
//		
//		double temp = Math.random() * 101;
//		double temp = Math.random() * 6 + 1;  // 骰子
//		double temp = Math.random() * 49 + 1; // 大樂透
//			int score = (int)temp;
//			System.out.println(score);
//			if (score >= 60) {
//				System.out.println("Pass");
//			}else {
//				System.out.println("Down");
//			}
		
		
		double temp = Math.random() * 101;
			int score = (int)temp;
			System.out.println(score);
			if (score >= 90) {
				System.out.println("A");
			} else if (score >= 80) {
				System.out.println("B");
			} else if (score >= 70) {
				System.out.println("C");
			} else if (score >= 60){
				System.out.println("D"); 
			} else {
				System.out.println("E");
			}
			
	}

}
