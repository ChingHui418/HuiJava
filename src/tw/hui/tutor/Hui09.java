package tw.hui.tutor;

public class Hui09 {

	public static void main(String[] args) {
		// 無窮迴圈 Loop
		int i = 0;
		for ( printHui() ; i < 10 ; printLine() ) {
			System.out.println(i++ );
		}
		System.out.println("----");
		System.out.println(i);
	}
	
    // 類似定義 function 呼叫 -> 做事
	static void printHui() {
		System.out.println("Hui");
	}
	
	static void printLine() {
		System.out.println("----");
	}

}
