package tw.hui.practice;

import java.util.Scanner;

public class GuessFinal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int anser = (int)(Math.random()*100 + 1);
		int guess = -1;
		int count = 0;
		
		System.out.println("--- 終極密碼遊戲 1-100，請猜一組數字 ---");
		
		do {
			System.out.print("猜數字：");
			
			if(scanner.hasNextInt()) {
				guess = scanner.nextInt();
				count++;
			
				if(guess<1 || guess>100) {
					System.out.println("輸入無效，請輸入1-100之間的數字");
				} else if (guess>anser){
					System.out.println("太大");
				} else if (guess<anser) {
					System.out.println("太小");
				}
			}else {
				System.out.println("輸入格式錯誤，請輸入數字！");
				scanner.next();
			}
		} while(guess !=anser);
		System.out.println("恭喜答對了！");
		System.out.println("你總共猜了" + count + " 次！");
		
		scanner.close();
	}
	
}
